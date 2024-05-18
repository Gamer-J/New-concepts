const express = require("express"); //express =backend framework enables me to use functions like app.get
const cors = require('cors');
const bodyParser = require('body-parser');
const app = express(); //specifying that app is an express object
const port = 3000; //where information passes through
app.use(bodyParser.json());
app.use(cors());
app.get("/", (req, res) => {
  // App then .get(asks the server for information) .post(create) .put(updates) .delete
  res.send("Hello World!"); //req is the request
});
app.post("/post", (req, res) => {
  console.log("Creating something");
});
app.post("/average", (req, res) => {
  const gradesList = req.body.list; 
  console.log(gradesList);
  let sum = 0;
  gradesList.forEach((element) => {
    sum += parseInt(element);
  });
  const finalAverage = sum / gradesList.length;
  res.send({ average: finalAverage });
});
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
