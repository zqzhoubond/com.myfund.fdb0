/**
 * The DiscAcceFnd entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class DiscAcceFnd implements  Serializable{
    static mapping = {
         table 'disc_acce_fnd'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'disc_id', params:[sequence:'disc_acce_fnd_sequence']
         id generator:'identity', column:'DISC_ID'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'acce_order', params:[sequence:'disc_acce_fnd_sequence']
         id generator:'identity', column:'ACCE_ORDER'
         id composite:['discId','acceOrder'], generator:'assigned'
    }
    String discId
    Long acceOrder
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    String acceRoute
    String acceType
    String acceTitle
    Long geniusUid
    String acceRouteMd5

    static constraints = {
        discId(size: 1..18, blank: false)
        acceOrder(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        acceRoute(size: 0..255)
        acceType(size: 1..20, blank: false)
        acceTitle(size: 0..80)
        geniusUid(max: 9223372036854775807L)
        acceRouteMd5(size: 0..32)
    }
    String toString() {
        return "${discId}" 
    }
}
