/**
 * The DiscClsFnd entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class DiscClsFnd implements  Serializable{
    static mapping = {
         table 'disc_cls_fnd'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'disc_id', params:[sequence:'disc_cls_fnd_sequence']
         id generator:'identity', column:'DISC_ID'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'cls_code', params:[sequence:'disc_cls_fnd_sequence']
         id generator:'identity', column:'CLS_CODE'
         id composite:['discId','clsCode'], generator:'assigned'
    }
    String discId
    String clsCode
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate

    static constraints = {
        discId(size: 1..18, blank: false)
        clsCode(size: 1..24, blank: false)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
    }
    String toString() {
        return "${discId}" 
    }
}
