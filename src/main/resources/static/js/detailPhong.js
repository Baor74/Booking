const getRoom = async () => {
    let urlPath = window.location.pathname;
    let maKhachSan = urlPath.split('/').pop();
    let container = $('#getRoom');
    await axios.get(`/api-phong/find-phong-by-ma-khach-san?maKhachSan=${maKhachSan}&trangThai=false`)
        .then(response => {
            container.html('');
            console.log(response.data.data);
            if (response.data.data==null){
                container.html('<p>Không tìm thấy khách sạn phù hợp.</p>');
                return;
            }
            response.data.data.forEach(phong => {
                let html = `
                <div class="d-flex mt-2">
        <div class="card-img" style="width: 270px;">
          <a href="#" class="d-block">
            <img class="rounded" src="/img/${phong.hinh}" alt="blog-img" width="250"/>
          </a>
        </div>
        <div class="card-body">
          <h3 class="card-title">
            <a href="#">${phong.kieuPhong}</a>
          </h3>
          
          <div class="card-price d-flex align-items-center justify-content-between">
            <p>
              <span class="price__from">Giá</span>
              <span class="price__num">${phong.gia}  VND</span>
              <span class="price__text">/Ngày</span>
            </p>
          <p class="card-meta">${phong.moTa}</p>
            <a href="#" class="btn-text">Đặt ngay<i
                class="la la-angle-right"></i></a>
          </div>
        </div>
      </div>
                `;
                container.append(html);
            });
        })
        .catch(error => {
            alert(error);
        });
}
// Gọi hàm getAllProduct khi trang được tải
document.addEventListener('DOMContentLoaded', getRoom);