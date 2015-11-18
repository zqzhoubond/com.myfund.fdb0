/**
 * The FndUnitChng entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndUnitChng implements  Serializable{
    static mapping = {
         table 'fnd_unit_chng'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_unit_chng_sequence']
         id generator:'identity', column:'inner_code'
         id column:'end_date'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'info_source', params:[sequence:'fnd_unit_chng_sequence']
         id generator:'identity', column:'info_source'
         id composite:['innerCode','endDate','infoSource'], generator:'assigned'
    }
    Long innerCode
    Date endDate
    Long infoSource
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    Date startDate
    String infoSourceMark
    java.math.BigDecimal existShare
    java.math.BigDecimal startShare
    java.math.BigDecimal applShares
    java.math.BigDecimal redeemShares
    java.math.BigDecimal shiftInShare
    java.math.BigDecimal shiftOutShare
    java.math.BigDecimal dividInvestShare
    java.math.BigDecimal splitShare
    java.math.BigDecimal increShare
    java.math.BigDecimal translShare
    java.math.BigDecimal endShares
    java.math.BigDecimal endSharesMerge
    Long ifMerge

    static constraints = {
        innerCode(max: 9999999999L)
        endDate()
        infoSource(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
        startDate(nullable: true)
        infoSourceMark(size: 0..50)
        existShare(nullable: true)
        startShare(nullable: true)
        applShares(nullable: true)
        redeemShares(nullable: true)
        shiftInShare(nullable: true)
        shiftOutShare(nullable: true)
        dividInvestShare(nullable: true)
        splitShare(nullable: true)
        increShare(nullable: true)
        translShare(nullable: true)
        endShares(nullable: true)
        endSharesMerge(nullable: true)
        ifMerge(nullable: true, max: 9999999999L)
    }
    String toString() {
        return "${innerCode}" 
    }
}
