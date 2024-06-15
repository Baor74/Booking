package com.example.demo.controller.Controller;

import com.example.demo.controller.Entity.KhachHang;
import com.example.demo.controller.Entity.KhachSan;
import com.example.demo.controller.Responsitory.KhachHangRepo;
import com.example.demo.controller.Responsitory.KhachSanRepo;
import jakarta.servlet.ServletContext;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AdminController {
  //Quốc
  @Autowired
  KhachHangRepo khachHangRepo;

  @Autowired
  KhachSanRepo khachSanRepo;

  @Autowired
  ServletContext app;
  @GetMapping("/admin/user")
  public String user(Model model, @ModelAttribute("userEdit") KhachHang khachHang,
      @RequestParam("name") Optional<String> name) {
    model.addAttribute("accountList", khachHangRepo.findKhachHangByUsername("%" + name.orElse("") + "%"));
    model.addAttribute("name", name.orElse(""));
    return "";
  }

  @GetMapping("/admin/user/delete/{username}")
  public String user_delete(@ModelAttribute("userEdit") KhachHang khachHang, @PathVariable("username") String username,
      Model model) {
    return "";
  }

  @PostMapping("/admin/user/edit")
  public String user_update(@Validated @ModelAttribute("userEdit") KhachHang khachHang, BindingResult result, Model model,
      @RequestParam("image") Optional<MultipartFile> file) {
    return "";
  }

  //------------------------------------------------------Sản phẩm----------------------------------------------
  @GetMapping("/admin/product")
  public String product(Model model, @ModelAttribute("productEdit") KhachSan khachSan,
      @RequestParam("name") Optional<String> name) {
    return "";
  }

  @GetMapping("/admin/product/delete/{id}")
  public String product_delete(@ModelAttribute("productEdit") KhachSan khachSan, @PathVariable("id") Integer id,
      Model model) {
    return "";
  }

  @PostMapping("/admin/product/edit")
  public String product_update(@Validated @ModelAttribute("productEdit") KhachSan khachSan, BindingResult result,
      Model model, @RequestParam("categoryId") String caId) {
    return "";
  }

  // ------------------------------------------------------Đơn
  // hàng----------------------------------------------
  @GetMapping("/admin/order")
  public String order(Model model, @RequestParam("id") Optional<Long> id) {
    return "";
  }
  // ------------------------------------------------------Thêm sản
  // phẩm----------------------------------------------

  @GetMapping("/admin/add-product")
  public String add_product(Model model, @ModelAttribute("productAdd") KhachSan khachSan) {
    return "";
  }

  @PostMapping("/admin/add-product")
  public String add_product_post(Model model, @ModelAttribute("productAdd") KhachSan khachSan,
      @RequestParam("images") MultipartFile[] files, @RequestParam("categoryId") String categoryId) {
    return "";
  }

  @ModelAttribute("productList")
  public List<KhachSan> productList() {
    return khachSanRepo.findAll();
  }


  @ModelAttribute("accountList")
  public List<KhachHang> accountList() {
    return khachHangRepo.findAll();
  }
}
