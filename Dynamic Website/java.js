function gnrinput() {
  const numinput = document.getElementById("numgrd").value; //gets element based on id, id is specified in html file
  let grdbars = document.getElementById("grdbar"); //specifies what grdbars is Grdbars is the name of the bars greated to input grade
  while (grdbars.firstElementChild != null) {
    //while something is still there

    grdbars.removeChild(grdbars.firstElementChild); // removes the First element(First thing added to grdbars)
  }
  for (let i = 0; i < numinput; i++) {
    //from 0 to num input we create a tag and add that tag to grdbars

    let inputtag = document.createElement("input");
    grdbars.appendChild(inputtag); //adds it to the very end of the children list
  }
  console.log(numinput);
}
async function getAverage() {
  let grdbars = document.getElementById("grdbar");
  let gradesList = [];
  grdbars.childNodes.forEach((element) => {
    gradesList.push(element.value);
  });
  console.log(gradesList);
  const response = await fetch("http://localhost:3000/average", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ list: gradesList }),
  });

  const data = await response.json();
  console.log(data);
}
