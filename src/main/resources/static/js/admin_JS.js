const getAdminKhachHang = async () => {
  let productContainer = $('#adminkhachhang');
  await axios.get('/admin-khachhang/getAllkhachHang')
  .then(response => {
    productContainer.html('');
    response.data.data.forEach(khachhang => {
      let html = `
                <tr>
                    <td>${khachhang.maKhachHang}</td>
                    <td>${khachhang.username}</td>
                    <td>${khachhang.fullname}</td>
                    <td>${khachhang.gender ? "Nam" : "Nữ"}</td>
                    <td>${khachhang.birthday}</td>
                    <td>${khachhang.address}</td>
                    <td>${khachhang.email}</td>
                    <td>${khachhang.sdt}</td>
                    <td>
                      <a style="background-color: #28d5a7;border:none;" class="edit-btn theme-btn theme-btn-small me-1" data-maKhachHang="${khachhang.maKhachHang}"><i class="bi bi-pencil-square"></i></a> 
                      <a style="background-color: #e1306c;border:none;" class="theme-btn theme-btn-small delete-btn" data-khachhangid="${khachhang.maKhachHang}"><i class="bi bi-x-lg"></i></a>
                     </td>
                  </tr>
                `;
      productContainer.append(html);
    });
  })
  .catch(error => {
    alert(error);
  });
  productContainer.on('click', '.delete-btn', async function () {
    let khachHangId = $(this).data('khachhangid');
    if (confirm('Bạn có chắc chắn muốn xóa khách hàng này?')) {
      await axios.delete(`/admin-khachhang/deleteKhachHang/${khachHangId}`)
      .then(response => {
        alert(response.data.message);
        getAdminKhachHang(); // Cập nhật lại bảng sau khi xóa thành công
      })
      .catch(error => {
        alert('Xóa khách hàng thất bại');
      });
    }
  });

}
// Gọi hàm getAllProduct khi trang được tải
document.addEventListener('DOMContentLoaded', getAdminKhachHang);
//edit user
