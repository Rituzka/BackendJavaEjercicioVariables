var year = 1948;
var yearBirth = 1968;
var leapYear = false;
var leapBirth = 'Has nacido en un año bisiesto';
var noLeapBirth = 'No has nacido en un año bisiesto';

for (let index = year; index <= yearBirth; index = index + 4) {
  document.write (index + '<br>');

  if (index == yearBirth) {
    leapYear = true;
  }
}

document.write ('');

if (leapYear == true) {
  document.write ('<br>' + leapBirth);
} else {
  document.write (noLeapBirth);
}
