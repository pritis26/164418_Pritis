var express = require('express');
var app = express();

app.get('/home', function (req, res) {
   res.send('Hello World');
})
app.listen(3001)