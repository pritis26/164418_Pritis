
var express = require('express');
var app = express();


var products = ["mobile", "powerbang", "watch"];
var price=[1000,210,45600];


app.get('/items', function (req, res) {
console.log("Got a GET-items request for the homepage");
res.send(products);
})

app.get('/items/:id', function (req, res) {
var Id=req.params.id;
res.send(products[Id]);
})


app.post('/items/:name', function (req, res) {

const name=req.params.name;
products.push(name);
res.send(products);
})

app.delete('/items/delete/:id', function (req, res) {
var Id=req.params.id;
products.splice(Id,1);
res.send(products);
})


app.patch('/items/:name/:id', function(req,res){
var Id=req.params.id;
var name=req.params.name;
products[Id]=name;
res.send(products);
})



var server = app.listen(8081, function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
})
