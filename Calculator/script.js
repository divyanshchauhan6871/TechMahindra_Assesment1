handleclick = (value) => {
  document.getElementById("display").value += value;
};

clearDisplay = () => {
  document.getElementById("display").value = "";
};

calculateResult = () => {
  try {
    document.getElementById("display").value = eval(
      document.getElementById("display").value
    );
  } catch {
    document.getElementById("display").value = "";
  }
};
