const tabs = document.querySelectorAll('.nav-tabs li');
const panes = document.querySelectorAll('.tab-pane');

tabs.forEach(tab => {
  tab.addEventListener('click', switchTab);
});

function switchTab(e) {
  const target = e.target;
  tabs.forEach(tab => tab.classList.remove('active'));
  panes.forEach(pane => pane.classList.remove('active'));
  target.classList.add('active');
  const tabId = target.getAttribute('href');
  document.querySelector(tabId).classList.add('active');
}
let adultValue = 0;
let childValue = 0;


$('#nguoiLon .input-group-text').click(function(e) {

  if(this.innerHTML == "+") {
    adultValue++;  
  } else {
    adultValue--;
  }

  $('#nguoiLon input').val(adultValue);
  e.stopPropagation();
})


$('#treEm .input-group-text').click(function(e) {

  if(this.innerHTML == "+") {  
    childValue++;
  } else {
    childValue--;
  }

  $('#treEm input').val(childValue);
  e.stopPropagation();
})

let VipRoom = 0;
let NorRoom = 0;


$('#VipRoom .input-group-text').click(function(e) {

  if(this.innerHTML == "+") {
    VipRoom++;  
  } else {
    VipRoom--;
  }

  $('#VipRoom input').val(VipRoom);
  e.stopPropagation();
})


$('#NorRoom .input-group-text').click(function(e) {

  if(this.innerHTML == "+") {  
    NorRoom++;
  } else {
    NorRoom--;
  }

  $('#NorRoom input').val(NorRoom);
  e.stopPropagation();
})
