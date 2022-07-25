// import { add, subtract } from './math.js';
import math from './math.js' //this is calling the default export

console.log(math.add(1, 2));
console.log(math.subtract(2, 1));
console.log(math.msg);

//told node we are gonna reference code in math module, bring in items that have been exported 
// its name is add
// subtract isn't found because it is not included in the import (when it wasn't)