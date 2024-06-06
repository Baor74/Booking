package com.example.demo.controller.Controller;


import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Responsitori.KhachSanDAO;
import com.example.demo.controller.Utils.SessionService;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TrendController {

  @Autowired
  KhachSanDAO khachSanDAO;

  @Autowired
  SessionService sessionService;

  @GetMapping("/trend")
  public String trend(Model model, @RequestParam("tenKhachSan") Optional<String> tenKhachSan) {
    List<KhachSan> listKhachSan = khachSanDAO.findAllByTenKhachSanLike(tenKhachSan.orElse(""));
    Map<Integer, Object[]> map = new HashMap<>();
    for (KhachSan ks : listKhachSan) {
      map.put(ks.getMaKhachSan(),
          new Object[]{ks.getTenKhachSan(), ks.getDiaChi(), ks.getXepHang(), ks.getImage()});
    }
    model.addAttribute("listKhachSan", map);

    return "trend";
  }
}
