//
// --------------------------------------------------------------------------
//  Gurux Ltd
// 
//
//
// Filename:        $HeadURL$
//
// Version:         $Revision$,
//                  $Date$
//                  $Author$
//
// Copyright (c) Gurux Ltd
//
//---------------------------------------------------------------------------
//
//  DESCRIPTION
//
// This file is a part of Gurux Device Framework.
//
// Gurux Device Framework is Open Source software; you can redistribute it
// and/or modify it under the terms of the GNU General Public License 
// as published by the Free Software Foundation; version 2 of the License.
// Gurux Device Framework is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of 
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
// See the GNU General Public License for more details.
//
// More information of Gurux products: https://www.gurux.org
//
// This code is licensed under the GNU General Public License v2. 
// Full text may be retrieved at http://www.gnu.org/licenses/gpl-2.0.txt
//---------------------------------------------------------------------------

package gurux.dlms.objects.enums;

import java.util.HashSet;
import java.util.Set;

/*
 * Defines the weekdays.
 */
public enum Weekdays {
    /**
     * Indicates Monday.
     */
    MONDAY(0x1),
    /**
     * Indicates Tuesday.
     */
    TUESDAY(0x2),
    /**
     * Indicates Wednesday.
     */
    WEDNESDAY(0x4),
    /**
     * Indicates Thursday.
     */
    THURSDAY(0x8),
    /**
     * Indicates Friday.
     */
    FRIDAY(0x10),
    /**
     * Indicates Saturday.
     */
    SATURDAY(0x20),
    /**
     * Indicates Sunday.
     */
    SUNDAY(0x40);

    private int value;

    /*
     * Constructor.
     */
    Weekdays(final int forValue) {
        value = forValue;
    }

    /*
     * Get integer value for enumerator.
     */
    public int getValue() {
        return value;
    }

    /**
     * @return Get enumeration constant values.
     */
    private static Weekdays[] getEnumConstants() {
        return new Weekdays[] { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
                SATURDAY, SUNDAY };

    }

    /**
     * Converts the integer value to enumerated value.
     * 
     * @param value
     *            The integer value, which is read from the device.
     * @return The enumerated value, which represents the integer.
     */
    public static java.util.Set<Weekdays> forValue(final int value) {
        Set<Weekdays> types = new HashSet<Weekdays>();
        Weekdays[] enums = getEnumConstants();
        for (int pos = 0; pos != enums.length; ++pos) {
            if ((enums[pos].value & value) == enums[pos].value) {
                types.add(enums[pos]);
            }
        }
        return types;
    }

    /**
     * Converts the enumerated value to integer value.
     * 
     * @param value
     *            The enumerated value.
     * @return The integer value.
     */
    public static int toInteger(final Set<Weekdays> value) {
        int tmp = 0;
        for (Weekdays it : value) {
            tmp |= it.getValue();
        }
        return tmp;
    }
}
