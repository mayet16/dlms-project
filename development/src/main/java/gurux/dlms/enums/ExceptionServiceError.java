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

package gurux.dlms.enums;

import java.util.HashMap;

/**
 * DLMS service errors.
 * 
 * @author Gurux Ltd.
 */
public enum ExceptionServiceError {
    /**
     * Operation is not possible
     */
    OPERATION_NOT_POSSIBLE(1),

    /**
     * Service is not supported.
     */
    SERVICE_NOT_SUPPORTED(2),

    /**
     * Other reason.
     */
    OTHER_REASON(3),

    /**
     * PDU is too long.
     */
    PDU_TOO_LONG(4),

    /**
     * Ciphering failed.
     */
    DECIPHERING_ERROR(5),

    /**
     * Invocation counter is invalid.
     */
    INVOCATION_COUNTER_ERROR(6);

    /**
     * Integer value of enumerator.
     */
    private int intValue;

    /**
     * Collection of enumerator values.
     */
    private static java.util.HashMap<Integer, ExceptionServiceError> mappings;

    /**
     * Returns collection of enumerator values.
     * 
     * @return Enumerator values.
     */
    private static HashMap<Integer, ExceptionServiceError> getMappings() {
        synchronized (ExceptionServiceError.class) {
            if (mappings == null) {
                mappings = new HashMap<Integer, ExceptionServiceError>();
            }
        }
        return mappings;
    }

    /**
     * Constructor.
     * 
     * @param value
     *            Integer value of enumerator.
     */
    ExceptionServiceError(final int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    /**
     * Get integer value for enumerator.
     * 
     * @return Enumerator integer value.
     */
    public int getValue() {
        return intValue;
    }

    /**
     * Returns enumerator value from an integer value.
     * 
     * @param value
     *            Integer value.
     * @return Enumeration value.
     */
    public static ExceptionServiceError forValue(final int value) {
        return getMappings().get(value);
    }
}