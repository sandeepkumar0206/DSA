/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let a=n;///10
    return function() {
        return a++;//10--11-1211
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */