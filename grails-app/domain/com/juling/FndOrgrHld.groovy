/**
 * The FndOrgrHld entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndOrgrHld implements  Serializable{
    static mapping = {
         table 'fnd_orgr_hld'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fund_id', params:[sequence:'fnd_orgr_hld_sequence']
         id generator:'identity', column:'FUND_ID'
         id column:'enddate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'orgr_seq', params:[sequence:'fnd_orgr_hld_sequence']
         id generator:'identity', column:'ORGR_SEQ'
         id composite:['fundId','enddate','orgrSeq'], generator:'assigned'
    }
    Long fundId
    Date enddate
    Long orgrSeq
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Long orgrCode
    String orgrName
    java.math.BigDecimal orgrHldNtrdVol
    java.math.BigDecimal orgrHldVol

    static constraints = {
        fundId(max: 9999999999L)
        enddate()
        orgrSeq(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        orgrCode(nullable: true, max: 9999999999L)
        orgrName(size: 0..200)
        orgrHldNtrdVol(nullable: true)
        orgrHldVol(nullable: true)
    }
    String toString() {
        return "${fundId}" 
    }
}
