/**
 * The DiscMainFnd entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class DiscMainFnd {
    static mapping = {
         table 'disc_main_fnd'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'disc_id', params:[sequence:'disc_main_fnd_sequence']
         id generator:'identity', column:'DISC_ID'
    }
    String discId
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Date declaredate
    String title
    String source
    String qjNum
    String isAcce
    Date enddate
    Long geniusUid
    Long isContent

    static constraints = {
        discId(size: 1..18, blank: false)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        declaredate(nullable: true)
        title(size: 0..256)
        source(size: 0..128)
        qjNum(size: 0..6)
        isAcce(size: 0..1)
        enddate(nullable: true)
        geniusUid(max: 9223372036854775807L)
        isContent(nullable: true, max: 9999999999L)
    }
    String toString() {
        return "${discId}" 
    }
}
