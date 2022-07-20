
function incrementArray(arr) {
    let results = [];
    for (let val of arr) {
        results.push(val + 1);
    }
    return results;
}

function decrementArray(arr) {
    let results = [];
    for (let val of arr) {
        results.push(val - 1);
    }
    return results;
}

function multiplyArray(arr) {
    let results = [];
    for (let val of arr) {
        results.push(val * 2);
    }
    return results;
}

//document function
/**
 * applies a supply transformation to each element in the array
 * returning a new array
 * 
 * @param {*[]} arr - the source array to be processed
 * @param {function} fn - the transformation function to be applied
 * @param {*} [init = 0] - optional 
 * @returns - returns a ney array with the transformation function applied to each element
 */
function transformArray(arr, fn, init = 0) {
    let results = [];
    for (let val of arr) {
        results.push(fn(val));
    }
    return results;
}


const nums = [1, 2, 3, 4, 5, 6];

console.log(incrementArray(nums));
console.log(decrementArray(nums));
console.log(multiplyArray(nums));
console.log(transformArray(nums, (v) => v * 10));
console.log(nums.map((v) => v * 10));
//map is function built onto array obj, map will iterate array and apply fn and return back new array that has the function applied
//map does same thing as line 40

console.log("=================================")

//calls function with each element in array, but does not return any value (void), process each val but not mutate it
nums.forEach((v) => {
    console.log(v);
})

//filtered down to specific things we want, function has to return true or false on each element to push or not
console.log(nums.filter((v) => v % 2 === 0));

//find returns val of first element that meets as true within the condition
console.log(nums.find((v) => v % 2 === 0));

//find index, like find but returns index instead of the value that meets the condition
console.log(nums.findIndex((v) => v % 2 === 0));

//join returns a string where each item has been concatenated together separated by a supplied separator
console.log(nums.join(","));

function sumAll(nums) {
    let acc = 0;
    for (let num of nums) {
        acc += num
    }
    return acc;
}

//reduce, process array and perform an operation on it to get some other value
//to sum up elements, can't use map because its treating each element individually
// does same thing as sumAll()
console.log(nums.reduce((acc, num) => acc += num))

//give 0 so reduce wont use the "abc" as the intial value and will start iteration at a. IntitialValue.
function countLetters(words) {
    return words.reduce((runningCount, word) => runningCount += word.length, 0);
}

console.log(countLetters(["abc", "def"]));

