/**
 * @param {string} columnTitle
 * @return {number}
 */
var titleToNumber = function(columnTitle) {
    let res = 0;
  for (let i = 0; i < columnTitle.length; i++) {
    res +=
      (columnTitle.charCodeAt(i) - 64) *
      Math.pow(26, columnTitle.length - i - 1);
  }
  return res;
    
};