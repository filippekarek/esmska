/*
 * Operator.java
 *
 * Created on 7. červenec 2007, 14:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package esmska.operators;

import java.net.URL;
import esmska.data.SMS;
import javax.swing.Icon;

/** Interface to operators
 *
 * @author ripper
 */
public interface Operator {
    /** get image url so user can type the code */
    URL getSecurityImage();
    /** send the sms */
    boolean send(SMS sms);
    /** maximum sendable chars */
    int getMaxChars();
    /** length of one sms */
    int getSMSLength();
    /** number of allowed sms's user can send at once */
    int getMaxParts();
    /** whether signature is supported */
    boolean isSignatureSupported();
    /** number of characters needed to add to signature,
     * therefore strip from message length */
    int getSignatureExtraLength();
    /** operator icon */
    Icon getIcon();
    
    /** operator name */
    String toString();
    boolean equals(Object obj);
    int hashCode();
}