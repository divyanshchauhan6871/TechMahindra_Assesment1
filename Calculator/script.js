handleclick = (value) => {
  document.getElementById("display").value += value;
};

clearDisplay = () => {
  document.getElementById("display").value = "";
};

calculateResult = () => {
  document.getElementById("display").value = eval(
    document.getElementById("display").value
  );
};
