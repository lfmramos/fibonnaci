/**
 * Calculates the n-th number in the Fibonacci sequence using recursion.
 *
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
 * The sequence starts with 0 and 1, and the subsequent numbers are calculated as:
 * F(n) = F(n-1) + F(n-2)
 *
 * @param {number} n - The position in the Fibonacci sequence to calculate.
 * @returns {number} - The n-th number in the Fibonacci sequence.
 */
function fibonacci(n) {
    if (n < 2) { // base case of the recursion
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
    }
}

// Example usage:
console.log(fibonacci(10)); // Output: 55