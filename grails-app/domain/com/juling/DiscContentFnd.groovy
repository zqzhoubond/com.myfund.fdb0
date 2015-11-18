/**
 * The DiscContentFnd entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class DiscContentFnd {
    static mapping = {
         table 'disc_content_fnd'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'disc_id', params:[sequence:'disc_content_fnd_sequence']
         id generator:'identity', column:'DISC_ID'
    }
    String discId
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    String txtContent
    Long geniusUid

    static constraints = {
        discId(size: 1..18, blank: false)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        txtContent()
        geniusUid(max: 9223372036854775807L)
    }
    String toString() {
        return "${discId}" 
    }
}
