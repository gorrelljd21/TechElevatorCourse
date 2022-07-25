// export doesn't have to be here because of the default export
export function add(x, y) {
    return x + y;
}

function subtract(x, y) {
    return x - y;
}

let msg = "hello world";

export default {
    add,
    subtract,
    msg
}

//said this a module by using export
//you can only have one default export
//as many named exports as you want