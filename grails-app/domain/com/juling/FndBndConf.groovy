/**
 * The FndBndConf entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndBndConf implements  Serializable{
    static mapping = {
         table 'fnd_bnd_conf'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fund_id', params:[sequence:'fnd_bnd_conf_sequence']
         id generator:'identity', column:'FUND_ID'
         id column:'enddate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'source', params:[sequence:'fnd_bnd_conf_sequence']
         id generator:'identity', column:'SOURCE'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'bnd_inner_code', params:[sequence:'fnd_bnd_conf_sequence']
         id generator:'identity', column:'BND_INNER_CODE'
         id composite:['fundId','enddate','source','bndInnerCode'], generator:'assigned'
    }
    Long fundId
    Date enddate
    Long source
    Long bndInnerCode
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    String sourceMark
    String bondcode
    String bondsname
    Long rank
    java.math.BigDecimal payBackTime
    java.math.BigDecimal totVal
    java.math.BigDecimal bondSum
    java.math.BigDecimal totValProp
    java.math.BigDecimal buyCost
    java.math.BigDecimal buyCostEndValProp
    Long ifConv

    static constraints = {
        fundId(max: 9999999999L)
        enddate()
        source(max: 9999999999L)
        bndInnerCode(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
        sourceMark(size: 0..50)
        bondcode(size: 0..12)
        bondsname(size: 0..50)
        rank(nullable: true, max: 9999999999L)
        payBackTime(nullable: true)
        totVal(nullable: true)
        bondSum(nullable: true)
        totValProp(nullable: true)
        buyCost(nullable: true)
        buyCostEndValProp(nullable: true)
        ifConv(nullable: true, max: 9999999999L)
    }
    String toString() {
        return "${fundId}" 
    }
}
