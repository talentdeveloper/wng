/******************************************************************************
 * Copyright © 2013-2016 The Nxt Core Developers.                             *
 *                                                                            *
 * See the AUTHORS.txt, DEVELOPER-AGREEMENT.txt and LICENSE.txt files at      *
 * the top-level directory of this distribution for the individual copyright  *
 * holder information and the developer policies on copyright and licensing.  *
 *                                                                            *
 * Unless otherwise agreed in a custom licensing agreement, no part of the    *
 * Nxt software, including this file, may be copied, modified, propagated,    *
 * or distributed except according to the terms contained in the LICENSE.txt  *
 * file.                                                                      *
 *                                                                            *
 * Removal or modification of this copyright notice is prohibited.            *
 *                                                                            *
 ******************************************************************************/

package wng;
import java.math.BigInteger;

public final class Genesis {

    public static final long GENESIS_BLOCK_ID = new BigInteger("12598053463077161409").longValue();
    public static final long CREATOR_ID = 23680010882730923L;
    public static final byte[] CREATOR_PUBLIC_KEY = {
            -38, 38, 98, -113, -31, -53, -52, -7, 79, -87, -48, 85, 110, -4, -87, -95,
            116, 123, 59, 37, 82, -14, -76, -69, 119, -39, -49, 121, -102, 102, -86, 1
    };

    public static final long[] GENESIS_RECIPIENTS = {
            Long.parseUnsignedLong("75963601147116201")
    };


    public static final int[] GENESIS_AMOUNTS = {
            1000000000
    };

    public static final byte[][] GENESIS_SIGNATURES = {
            {-45, 85, 54, 103, -43, 100, -57, 30, 66, 108, 71, -71, -4, 63, -94, -60, -73, 76, -110, 77, 79, 113, -17, -86, -24, 111, -18, 84, 14, 67, -19, 10, -56, 49, 75, 80, 3, 28, -28, -63, -104, 28, -3, -88, 87, 19, -62, -26, -113, -29, -10, 117, 6, 50, 20, -115, 88, 111, -17, 8, 1, -128, 34, 22}
    };

    public static final byte[] GENESIS_BLOCK_SIGNATURE = new byte[]{
            105, -44, 38, -60, -104, -73, 10, -58, -47, 103, -127, -128, 53, 101, 39, -63, -2, -32, 48, -83, 115, 47, -65, 118, 114, -62, 38, 109, 22, 106, 76, 8, -49, -113, -34, -76, 82, 79, -47, -76, -106, -69, -54, -85, 3, -6, 110, 103, 118, 15, 109, -92, 82, 37, 20, 2, 36, -112, 21, 72, 108, 72, 114, 17
    };

    private Genesis() {} // never

}
