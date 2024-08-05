
//    string is PRIMITIVE datataye 


let name="Sadik Pasha";          // string is primitive datatype
let age=25;                     // number is primitive datatype
let isMarried=true;               // boolean is primitive datatype
let city=null;                   // null is primitive datatype
let country=undefined;           // undefined is primitive datatype


//    sring in single or double  or back ticks Quotations 
     let str='sadik';
     let str2="sadik";
     let str3=`sadik`;        //--> helps in '," "  used and in multiline string




//  string functions  



let s="Sadik";    // which is primitive (immutable addresses by value) 
const  l=s.length;





let  s1=s.charAt(0);            //   returns the    character  at specified position 
let  s2=s.at(-1);               // same as charAt()  but acceprs NEGATIVE INDEX also
let s3=s.indexOf("a");          
let s4=s.slice(0,3);             // returns the substring (accepts the NEGATIVE Index ALSO)
let s5=s.substring(0,3);           
let s6=s.substr(0,s.length);       // second parametr is the length
let  s7=s.replace("s","m");        
let  s8=s.trim();                  // removes the white spaces at begining and end 
const s9=s.split("");              // returns the array of strings with delimiter 
let s10=s.toUpperCase();         
let s11=s.toLowerCase();
let s12=s.repeat(2);
let s13=s.search("s");

console.log(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13)


