var majorityElement = function(nums) {
    let val = nums.reduce((a, e)=>{a[e] = a[e] ? a[e] + 1 : 1; return a}, {} )
    let AllVal = Object.values(val);

    const highestVal = Math.max(...AllVal)

    const highestKeyVal = Object.keys(val).find((k)=>val[k] === highestVal)
    return highestKeyVal
};

let value = majorityElement([3,2,3])
console.log(value)