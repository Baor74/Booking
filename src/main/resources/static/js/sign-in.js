const login = async () => {
  const username = $('#username').val();
  const password = $('#password').val();

  const dataApi = {
    username: username,
    password: password,
  };

  try {
    const response = await axios.post('/account/sign-in', dataApi);
    const responseData = response.data;
    if (responseData.status === true) {
      Swal.fire({
        title: 'Thành công!',
        text: responseData.message,
        icon: 'success'
      });
      console.log(responseData.data);
    } else {
      Swal.fire({
        title: 'Đăng ký thất bại',
        text: responseData.message,
        icon: 'error'
      });
    }
  } catch (error) {
    Swal.fire({
      title: 'Đã xảy ra lỗi',
      text: 'Vui lòng thử lại sau',
      icon: 'error'
    });
  }
  console.log(dataApi)
};
$('#signinForm').on('click', login);



// function login() {
//   const username = document.getElementById("username").value;
//   const password = document.getElementById("password").value;
//
//   const data = {
//     username: username,
//     password: password
//   };
//
//   axios.post("/account/login", data)
//   .then(response => {
//     const result = response.data;
//     if (result.status) {
//       // Đăng nhập thành công
//       Swal.fire({
//         title: 'Thành công!',
//         text: result.message,
//         icon: 'success'
//       });
//       console.log(result.data);
//       // Thực hiện các hành động sau khi đăng nhập thành công
//     } else {
//       // Đăng nhập thất bại
//       Swal.fire({
//         title: 'Đăng nhập thất bại',
//         text: result.message,
//         icon: 'error'
//       });
//       // Thực hiện các hành động sau khi đăng nhập thất bại
//     }
//   })
//   .catch(error => {
//     Swal.fire({
//       title: 'Đã xảy ra lỗi',
//       text: 'Vui lòng thử lại sau',
//       icon: 'error'
//     });
//     console.error("Đã xảy ra lỗi:", error);
//     // Thực hiện các hành động khi xảy ra lỗi
//   });
// }