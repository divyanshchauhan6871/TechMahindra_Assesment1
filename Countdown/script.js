let time = 0;
let timer;
let isRunning = false;

updateDisplay = () => {
  let minutes = Math.floor(time / 60);
  let seconds = time % 60;
  document.getElementById("displayTime").innerText = `Time Left: ${String(
    minutes
  ).padStart(2, "0")}:${String(seconds).padStart(2, "0")}`;
};

startTimer = () => {
  if (!isRunning) {
    let minutes = parseInt(document.getElementById("minutesInput").value) || 0;
    let seconds = parseInt(document.getElementById("secondsInput").value) || 0;
    if (!time && (minutes > 0 || seconds > 0)) {
      time = minutes * 60 + seconds;
    }
    if (time > 0) {
      isRunning = true;
      timer = setInterval(() => {
        if (time > 0) {
          time--;
          updateDisplay();
        } else {
          clearInterval(timer);
          isRunning = false;
          alert("Time is up!");
        }
      }, 1000);
    }
  }
};

pauseTimer = () => {
  clearInterval(timer);
  isRunning = false;
};

resetTimer = () => {
  clearInterval(timer);
  isRunning = false;
  time = 0;
  document.getElementById("minutesInput").value = "";
  document.getElementById("secondsInput").value = "";
  updateDisplay();
};

updateDisplay();
