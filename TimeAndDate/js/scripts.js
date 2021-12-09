function renderTime() {
  var myDate = new Date();
  myDate;
  var year = myDate.getFullYear();

  var day = myDate.getDay();
  var month = myDate.getMonth();
  var dayOfMonth = myDate.getDate();
  var daysArray = new Array(
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
  );
  var monthsArray = new Array(
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December"
  );

  //Time
  var hours = myDate.getHours();
  var minutes = myDate.getMinutes();
  var seconds = myDate.getSeconds();
  if (hours == 24) {
    hours = 0;
  }

  if (hours < 10) {
    hours = "0" + hours;
  }

  if (minutes < 10) {
    minutes = "0" + minutes;
  }

  if (seconds < 10) {
    seconds = "0" + seconds;
  }

  var myClock = document.getElementById("clockDisplay");

  myClock.textContent =
    daysArray[day] +
    ", " +
    dayOfMonth +
    " " +
    monthsArray[month] +
    " " +
    year +
    " | " +
    hours +
    ":" +
    minutes +
    ":" +
    seconds;
  myClock.innerText =
    daysArray[day] +
    ", " +
    dayOfMonth +
    " " +
    monthsArray[month] +
    " " +
    year +
    " | " +
    hours +
    ":" +
    minutes +
    ":" +
    seconds;

  setTimeout("renderTime()", 1000);
}

renderTime();
