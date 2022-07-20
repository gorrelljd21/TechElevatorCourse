
/**
 * Into to JavaScript
 */


// a function
function variables() {

    // a constant
    const doesNotChange = 42;

    let thisCanChange = 0;

    //without let, out in global area and easy to get it wrong. JS will
    // just be created by the system if you mistype and there will be a 
    // new variable
    thisIsAVariable = "don't do this";

    //writes to the console (like print in java) 
    console.log(thisIsAVariable);

    //template (similar to print format in java)
    console.log(`the value of thisIsAString is ${thisIsAVariable}`);

    const weekdays = [
        "monday", "tuesday"
    ];

    //creates an actual table in console
    console.table(weekdays);

    //creates object literal - property whose name was variable and 
    //same value
    console.log({ thisIsAVariable });

}

function canDoMath() {
    console.log(2 + 2);

    console.log("hello " + "world");

    console.log("2" + 2); // 22 as a string (typeof() - use to find the 
    //type of data type)

    console.log("2" - 2); // outputs 0
}

function hasObjects() {
    //key value maps, key is property name
    const person = {
        firstName: "Jessie",
        lastName: "Gorrell",
        address: {
            street: "1776 Mentor"
        },
        //arrays
        children: [
            "megan", "jacob"
        ],

        toString: function () {
            return `${this.firstName} ${this.address.street}`;
        }
    }

    person.lastName = "smith";
    person.middleName = "joe";
    delete person.middleName;

    console.log(person);
    console.log(person.toString());
}

//NaN not a number
//js does not have overloading. Last instance of function is the one that 
// is seen

//if you want to provide concept of flexibility you can use conditionals 

//if variable is not specified, default is 0

function add(x, y) {
    return x + y;
}

function add(x, y, z) {
    return x + y + z;
}

function test(x) {
    if (x) {
        return true;
    } else {
        return false;
    }
}

function hi() {
    // let x = 17;

    // let stringDig = x.toString();

    // const lastDig = stringDig.substr(-1);

    // console.log(lastDig);

    let x = "redxxx";

    const char = "red";

    console.log(x.includes(char));
}

function bye() {
    array = [3, 5, 10, 20, 18, 21, 42, 67];
    x = 5;

    filteredArray = [];

    for (let i = 0; i < array.length; i++) {
        if (array[i] % x == 0) {
            filteredArray.push(array[i]);
        }
    }
    return filteredArray;
}



function makeNumber(first, second = '') {
    first = '42293';
    second = '443';

    let concatenated = first.concat(second);

    console.log(parseInt(concatenated));
}

