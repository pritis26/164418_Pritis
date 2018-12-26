var express = require('express');
var app = express();

app.get('/year', function(req, res){
var date= new Date();
var current_year=date.getFullYear();
var age=req.query.age;

var birth_year=current_year-age;
   res.send('You were born in year ' +birth_year );
});
app.listen(3000);