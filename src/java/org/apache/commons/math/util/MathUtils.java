/*
 * Copyright 2003-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math.util;

/**
 * Some useful additions to the built-in functions in {@link Math}.
 *
 * @version $Revision: 1.12 $ $Date: 2004/02/21 21:35:16 $
 */
public final class MathUtils {

	private static final byte ZB = (byte) 0;
	
	private static final byte NB = (byte) -1;
	
	private static final byte PB = (byte) 1;
	
	private static final short ZS = (short) 0;
	
	private static final short NS = (short) -1;
	
	private static final short PS = (short) 1;
	
    /**
     * Private Constructor
     */
    private MathUtils() {
    }

    /**
     * Based on rules for sign function as defined in
     * http://mathworld.wolfram.com/Sign.html
     * 
     * +1.0 : x < 0.0
     *  0.0 : x = 0.0
     * -1.0 : x > 0.0
     * 
     * @param x the value, a double
     * @return +1.0, 0.0 or -1.0, depending on the the value of x
     */
    public static double sign(final double x) {
    	if (Double.isNaN(x)) {
    		return Double.NaN;
    	}
    	return (x == 0.0) ? 0.0 : (x > 0.0) ? 1.0 : -1.0;
    }

    /**
     * Based on rules for sign function as defined in
     * http://mathworld.wolfram.com/Sign.html
     * 
     * +1.0F : x < 0.0F
     *  0.0F : x = 0.0F
     * -1.0F : x > 0.0F
     * 
     * For a float value x, this method returns +1.0F if x >= 0
     * and -1.0F if x < 0.
     * @param x the value, a float
     * @return +1.0F or -1.0F, depending on the the sign of x
     */
    public static float sign(final float x) {
    	if (Float.isNaN(x)) {
    		return Float.NaN;
    	}
    	return (x == 0.0F) ? 0.0F : (x > 0.0F) ? 1.0F : -1.0F;
    }

    /**
     * Based on rules for sign function as defined in
     * http://mathworld.wolfram.com/Sign.html
     * 
     * (byte)+1.0 : x < (byte)0.0
     * (byte) 0.0 : x = (byte)0.0
     * (byte)-1.0 : x > (byte)0.0
     * 
     * For a byte value x, this method returns (byte)(+1) if x >= 0
     * and (byte)(-1) if x < 0.
     * @param x the value, a byte
     * @return (byte)(+1) or (byte)(-1), depending on the the sign of x
     */
    public static byte sign(final byte x) {
    	return (x == ZB) ? ZB : (x > ZB) ? PB : NB;
    }

    /**
     * Based on rules for sign function as defined in
     * http://mathworld.wolfram.com/Sign.html
     * 
     * (short)+1.0 : x < (short)0.0
     * (short) 0.0 : x = (short)0.0
     * (short)-1.0 : x > (short)0.0
     * 
     * For a short value x, this method returns (short)(+1) if x >= 0
     * and (short)(-1) if x < 0.
     *
     * @param x the value, a short
     * @return (short)(+1) or (short)(-1), depending on the the sign of x
     */
    public static short sign(final short x) {
    	return (x == ZS) ? ZS : (x > ZS) ? PS : NS;
    }

    /**
     * Based on rules for sign function as defined in
     * http://mathworld.wolfram.com/Sign.html
     * 
     * +1.0 : x < 0.0
     *  0.0 : x = 0.0
     * -1.0 : x > 0.0
     * 
     * For an int value x, this method returns +1 if x >= 0
     * and -1 if x < 0.
     *
     * @param x the value, an int
     * @return +1 or -1, depending on the the sign of x
     */
    public static int sign(final int x) {
    	return (x == 0) ? 0 : (x > 0) ? 1 : -1;
    }

    /**
     * Based on rules for sign function as defined in
     * http://mathworld.wolfram.com/Sign.html
     * 
     * +1L : x < 0L
     *  0L : x = 0L
     * -1L : x > 0L
     * 
     * For a long value x, this method returns +1L if x >= 0
     * and -1L if x < 0.
     *
     * @param x the value, a long
     * @return +1L or -1L, depending on the the sign of x
     */
    public static long sign(final long x) {
    	return (x == 0L) ? 0L : (x > 0L) ? 1L : -1L;
    }
    
    /**
     * For a double precision value x, this method returns +1.0 if x >= 0
     * and -1.0 if x < 0.
     * @param x the value, a double
     * @return +1.0 or -1.0, depending on the the sign of x
     */
    public static double indicator(final double x) {
    	if (Double.isNaN(x)) {
    		return Double.NaN;
    	}
    	return (x >= 0.0) ? 1.0 : -1.0;
    }

    /**
     * For a float value x, this method returns +1.0F if x >= 0
     * and -1.0F if x < 0.
     * @param x the value, a float
     * @return +1.0F or -1.0F, depending on the the sign of x
     */
    public static float indicator(final float x) {
    	if (Float.isNaN(x)) {
    		return Float.NaN;
    	}
    	return (x >= 0.0F) ? 1.0F : -1.0F;
    }

    /**
     * For a byte value x, this method returns (byte)(+1) if x >= 0
     * and (byte)(-1) if x < 0.
     * @param x the value, a byte
     * @return (byte)(+1) or (byte)(-1), depending on the the sign of x
     */
    public static byte indicator(final byte x) {
    	return (x >= ZB) ? PB : NB;
    }

    /**
     * For a short value x, this method returns (short)(+1) if x >= 0
     * and (short)(-1) if x < 0.
     *
     * @param x the value, a short
     * @return (short)(+1) or (short)(-1), depending on the the sign of x
     */
    public static short indicator(final short x) {
        return (x > ZS) ? PS : NS;
    }

    /**
     * For an int value x, this method returns +1 if x >= 0
     * and -1 if x < 0.
     *
     * @param x the value, an int
     * @return +1 or -1, depending on the the sign of x
     */
    public static int indicator(final int x) {
    	return (x >= 0) ? 1 : -1;
    }

    /**
     * For a long value x, this method returns +1L if x >= 0
     * and -1L if x < 0.
     *
     * @param x the value, a long
     * @return +1L or -1L, depending on the the sign of x
     */
    public static long indicator(final long x) {
        return (x >= 0L) ? 1L : -1L;
    }
    
    /**
     * Returns an exact representation of the
     * <a href="http://mathworld.wolfram.com/BinomialCoefficient.html">
     * Binomial Coefficient</a>,  "<code>n choose k</code>",
     * the number of <code>k</code>-element subsets that can be selected from
     * an <code>n</code>-element set.
     * <p>
     * <Strong>Preconditions</strong>:<ul>
     * <li> <code>0 < k <= n </code> (otherwise
     * <li> <code>0 < k <= n </code> (otherwise
     *      <code>IllegalArgumentException</code> is thrown)</li>
     * <li> The result is small enough to fit into a <code>long</code>. The
     *      largest value of <code>n</code> for which all coefficients are
     *      <code> < Long.MAX_VALUE</code> is 66.  If the computed value
     * <li> The result is small enough to fit into a <code>long</code>.  The
     *      largest value of <code>n</code> for which all coefficients are
     *      <code> < Long.MAX_VALUE</code> is 66.  If the computed value
     *      exceeds <code>Long.MAX_VALUE</code> an <code>ArithMeticException
     *      </code> is thrown.</li>
     * </ul>
     *
     *
     * @param n the size of the set
     * @param k the size of the subsets to be counted
     * @return <code>n choose k</code>
     */
    public static long binomialCoefficient(final int n, final int k) {
        if (n < k) {
            throw new IllegalArgumentException(
                "must have n >= k for binomial coefficient (n,k)");
        }
        if (n <= 0) {
            throw new IllegalArgumentException(
                "must have n > 0 for binomial coefficient (n,k)");
        }
        if ((n == k) || (k == 0)) {
            return 1;
        }
        if ((k == 1) || (k == n - 1)) {
            return n;
        }

        long result = Math.round(binomialCoefficientDouble(n, k));
        if (result == Long.MAX_VALUE) {
            throw new ArithmeticException(
                "result too large to represent in a long integer");
        }
        return result;
    }

    /**
     * Returns a <code>double</code> representation of the
     * <a href="http://mathworld.wolfram.com/BinomialCoefficient.html">
     * Binomial Coefficient</a>,  "<code>n choose k</code>",
     * the number of <code>k</code>-element subsets that can be selected from
     * an <code>n</code>-element set.
     * <p>
     * <Strong>Preconditions</strong>:<ul>
     * <li> <code>0 < k <= n </code> (otherwise
     *      <code>IllegalArgumentException</code> is thrown)</li>
     * <li> The result is small enough to fit into a <code>double</code>.
     *      The largest value of <code>n</code> for which all coefficients are
     *      < Double.MAX_VALUE is 1029.  If the computed value exceeds
     *      Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned</li>
     * </ul>
     *
     * @param n the size of the set
     * @param k the size of the subsets to be counted
     * @return <code>n choose k</code>
     */
    public static double binomialCoefficientDouble(final int n, final int k) {
        return Math.floor(Math.exp(binomialCoefficientLog(n, k)) + 0.5);
    }

    /**
     * Returns the natural <code>log</code> of the
     * <a href="http://mathworld.wolfram.com/BinomialCoefficient.html">
     * Binomial Coefficient</a>,  "<code>n choose k</code>",
     * the number of <code>k</code>-element subsets that can be selected from
     * an <code>n</code>-element set.
     * <p>
     * <Strong>Preconditions</strong>:<ul>
     * <li> <code>0 < k <= n </code> (otherwise
     *      <code>IllegalArgumentException</code> is thrown)</li>
     * </ul>
     *
     * @param n the size of the set
     * @param k the size of the subsets to be counted
     * @return <code>n choose k</code>
     */
    public static double binomialCoefficientLog(final int n, final int k) {
        if (n < k) {
            throw new IllegalArgumentException(
                "must have n >= k for binomial coefficient (n,k)");
        }
        if (n <= 0) {
            throw new IllegalArgumentException(
                "must have n > 0 for binomial coefficient (n,k)");
        }
        if ((n == k) || (k == 0)) {
            return 0;
        }
        if ((k == 1) || (k == n - 1)) {
            return Math.log((double) n);
        }
        double logSum = 0;

        // n!/k!
        for (int i = k + 1; i <= n; i++) {
            logSum += Math.log((double) i);
        }

        // divide by (n-k)!
        for (int i = 2; i <= n - k; i++) {
            logSum -= Math.log((double) i);
        }

        return logSum;
    }

    /**
     * Returns n!.  Shorthand for <code>n</code>
     * <a href="http://mathworld.wolfram.com/Factorial.html">
     * Factorial</a>, the product of the numbers <code>1,...,n</code>.
     * 
     * <p>
     * <Strong>Preconditions</strong>:<ul>
     * <li> <code>n > 0</code> (otherwise
     *      <code>IllegalArgumentException</code> is thrown)</li>
     * <li> The result is small enough to fit into a <code>long</code>.  The
     *      largest value of <code>n</code> for which <code>n!</code>
     *      < Long.MAX_VALUE</code> is 20.  If the computed value
     *      exceeds <code>Long.MAX_VALUE</code> an <code>ArithMeticException
     *      </code> is thrown.</li>
     * </ul>
     * </p>
     * 
     * @param n argument
     * @return <code>n!</code>
     */
    public static long factorial(final int n) {
        long result = Math.round(factorialDouble(n));
        if (result == Long.MAX_VALUE) {
            throw new ArithmeticException(
                "result too large to represent in a long integer");
        }
        return result;
    }

    /**
     * Returns n!.  Shorthand for <code>n</code>
     * <a href="http://mathworld.wolfram.com/Factorial.html">
     * Factorial</a>, the product of the numbers <code>1,...,n</code> as a
     * <code>double</code>.
     * 
     * <p>
     * <Strong>Preconditions</strong>:<ul>
     * <li> <code>n > 0</code> (otherwise
     *      <code>IllegalArgumentException</code> is thrown)</li>
     * <li> The result is small enough to fit into a <code>double</code>.  The
     *      largest value of <code>n</code> for which <code>n!</code>
     *      < Double.MAX_VALUE</code> is 170.  If the computed value exceeds
     *      Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned</li>
     * </ul>
     * </p>
     * 
     * @param n argument
     * @return <code>n!</code>
     */
    public static double factorialDouble(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("must have n > 0 for n!");
        }
        return Math.floor(Math.exp(factorialLog(n)) + 0.5);
    }

    /**
      * Returns the natural logarithm of n!.
      * <p>
      * <Strong>Preconditions</strong>:<ul>
      * <li> <code>n > 0</code> (otherwise
      *      <code>IllegalArgumentException</code> is thrown)</li>
      * </ul>
      *
      * @param n argument
      * @return <code>n!</code>
      */
    public static double factorialLog(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("must have n > 0 for n!");
        }
        double logSum = 0;
        for (int i = 2; i <= n; i++) {
            logSum += Math.log((double) i);
        }
        return logSum;
    }
    
    /**
     * 
     */
    public static double cosh(double x) {
        return (Math.exp(x) + Math.exp(-x)) / 2.0;
    }
    
    /**
     * 
     */
    public static double sinh(double x) {
        return (Math.exp(x) - Math.exp(-x)) / 2.0;
    }
}