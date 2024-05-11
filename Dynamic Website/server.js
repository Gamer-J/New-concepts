const express = require("express"); //express =backend framework enables me to use functions like app.get
const app = express(); //specifying that app is an express object
const port = 3000; //where information passes through

app.get("/", (req, res) => {
  // App then .get(asks the server for information) .post(create) .put(updates) .delete
  res.send("Hello World!"); //req is the request
});
app.post("/post", (req, res) => {
  console.log("Creating something");
});
app.get("/average", (req, res) => {
  res.send("100");
});
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
