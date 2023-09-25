import * as data from 'Week_12/Homework/Instructions/.env';
// Initializes the npm packages used
console.log(data);
var mysql = require("mysql");
var inquirer = require("inquirer");
var dotenv = require("dotenv").config();
require("console.table");

// Initializes the connection variable to sync with a MySQL database
var connection = mysql.createConnection({
  host: "localhost",

  // Your port; if not 3306
  port: 3306,

  // Your username
  user: "root",

  // Your password
  password: "",
  database: "bamazon"
});

// Creates the connection with the server and loads the product data upon a successful connection
connection.connect(function(err) {
    if (err) {
      console.error("error connecting: " + err.stack);
    }
    loadProducts();
  });
  
  // Function to load the products table from the database and print results to the console
  function loadProducts() {
    // Selects all of the data from the MySQL products table
    connection.query("SELECT * FROM products", function(err, res) {
      if (err) throw err;
  
      // Draw the table in the terminal using the response
      console.table(res);
  
      // Then prompt the customer for their choice of product, pass all the products to promptCustomerForItem
      promptCustomerForItem(res);
    });
  }