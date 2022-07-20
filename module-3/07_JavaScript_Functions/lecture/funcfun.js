
function add(x, y) {
    return x + y;
}

let add2 = function (x, y) {
    return x + y;
}

//recursion

let add3 = function add3(x, y) {
    add3() //would only call if you need to call recursively
    return x + y;
}

//lamda, arrow function
//given x and y, return the result of whatever the code block evaluates to
//helps keep code concise
//we will statically capture content
let add4 = (x, y) => {
    return x + y;
}

//arrow function that doesn't require parameters
//the word function is optional
let noparms = () => {
    console.log("hello world");
}

//if only thing is calculation result and returning it, 
//code block not required 
let add5 = (x, y) => x + y;

//function attached to the object
let obj = {
    add6: function (x, y) {
        return x + y;
    },
    add7: (x, y) => x + y,
    add8(x, y) { return x + y; }
};

//method = function attached to object

//not evaluating, passing reference to a function
function acceptFunction(fn) {
    return fn(1, 2);
}

function returnfn() {
    return (x) => x * 4;
}

let theFun = returnfn();
console.log(theFun(4));


console.log(acceptFunction(add));
console.log(obj.add6(1, 2));
console.log(add5(1, 2));
console.log(acceptFunction((x, y) => x * y));
console.log(returnfn(4)(5));