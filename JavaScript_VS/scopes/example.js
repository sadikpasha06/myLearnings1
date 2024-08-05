//    to delcare a variable use let /const 

let name = "Sadik Pasha";      // when const not used 
const pi=3.14;                 // when values are fixed 
var  a="sadik";                // old usage 

//  let has the BLOCK scope, redeclaration not allowed in same block , redefinitation allowed

let a=12;        // here a=12
  
 if(10>2){
     let  a=1;   // here a=1  
          a=10   // here a=10
 }

//  let a=10;     redeclaration not allowed 

 console.log(a)
//  const has the block scope,redeclaration and redefination are not allowed  




// var had the global scope , and it is the default one 



