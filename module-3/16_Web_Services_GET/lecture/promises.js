
console.log('sync....');
console.log('first');
console.log('second');
console.log('third');

console.log('async...');
console.log('first');

const p = new Promise(
    (yayfn, boofn) => {
        //do some work;
        console.log('second')
        let itWorked = true;
        if (itWorked) yayfn(42)
        // yayfn('success')
        boofn('no good')
    }
);
p.then((result) => { return result + result; })
    .then((r) => { console.log("the result is " + r); })
    .catch((prob) => (console.log("the problem was " + prob)));

console.log('third');
