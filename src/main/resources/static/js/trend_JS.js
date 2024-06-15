// class UserManager {
//   constructor() {
//     this.khachsan = [];
//   }
//
//   async loadInit() {
//     await this.fetchKhachSan();
//     this.createTableProducts();
//   }
//
//   async fetchKhachSan() {
//     try {
//       const response = await axios.get('/api/khachsan-api/getAllKhachSan');
//       if (response.data.success) {
//         this.khachsan = response.data.data;
//       } else {
//         console.error('Lỗi: ', response.data.message);
//       }
//     } catch (error) {
//       console.error('Lỗi khi gọi API: ', error);
//     }
//   }
//
//   createTableProducts() {
//     const userRow = $('#userRow');
//     this.khachsan.forEach((khachsan, index) => {
//       if (index % 4 === 0) {
//         userRow.append('<div class="row mb-4"></div>');
//       }
//       const card = $(
//           '<div class="card-item mb-0" >' +
//           '<div class="card-img">'+
//           '<a href="#" class="d-block"> <img th:src="@{/img/${khachsan.hinh}" alt="Image"> </a>'+
//           '<div class="add-to-wishlist icon-element" data-bs-toggle="tooltip" data-placement="top" title="Bookmark">'+
//           '<i class="bi bi-heart"></i>'+
//           '</div>'+
//           '</div>'+
//           '<div class="card-body">'+
//           '<h3 class="card-title">'+
//           '<a  class="text-decoration-none" href="#">${khachsan.tenKhachSan}</a>'+
//           '</h3>'+
//           '<p  class="card-meta"></p>'+
//           '<div class="card-rating">'+
//           '<span class="badge text-white">${khachsan.xepHang}/5</span> '+
//           '<span class="review__text">Average</span> '+
//           '<span class="rating__text">(30 Reviews)</span>'+
//           '</div>'+
//           '<div class="card-price d-flex align-items-center justify-content-between">'+
//           '<p>'+
//           '<span class="price__from">From</span> <span class="price__num">$88.00</span>'+
//           '<span class="price__text">Per night</span>'+
//           '</p>'+
//           '<a href="#" class="btn-text">See details<i  class="la la-angle-right"></i>  </a>'+
//           '</div>'+
//           '</div>'+
//           '</div>');
//       userRow.find('.row').last().append(card);
//     });
//
//   }
// }
class UserManager {
  constructor() {
    this.users = [];
  }

  async loadInit() {
    await this.fetchUsers();
    this.createTableProducts();
  }

  async fetchUsers() {
    try {
      const response = await axios.get('/api/khachsan-api/getAllKhachSan');
      if (response.data.success) {
        this.users = response.data.data;
      } else {
        console.error('Lỗi: ', response.data.message);
      }
    } catch (error) {
      console.error('Lỗi khi gọi API: ', error);
    }
  }

  createTableProducts() {
    const userRow = $('#userRow');
    this.users.forEach((user, index) => {
      if (index % 4 === 0) {
        userRow.append('<div class="row mb-4"></div>');
      }
      const card = $('<div class="col-md-3">' +
          '<div class="card">' +
          '<div class="card-body">' +
          `<h5 class="card-title">Tên đăng nhập: ${user.userName}</h5>` +
          `<p class="card-text">Mật khẩu: ${user.password}</p>` +
          `<p class="card-text">Họ tên: ${user.fullName}</p>` +
          `<p class="card-text">Tuổi: ${user.age}</p>` +
          `<button class="btn btn-primary me-3 order-button" data-id="${user.userId}">Đặt hàng</button>` +
          `<button class="btn btn-secondary edit-button" data-id="${user.userId}">Chỉnh sửa</button>` +
          '</div>' +
          '</div>' +
          '</div>');
      userRow.find('.row').last().append(card);
    });

    $('.order-button').click(function() {
      const userId = $(this).data('id');
      alert('Đã đặt hàng sản phẩm có ID ' + userId + '!');
    });

    $('.edit-button').click(function() {
      const userId = $(this).data('id');
      window.location.href = `/users/id?id=${userId}`;
    });
  }
}