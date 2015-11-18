/**
 * The FndBndTypeConf entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndBndTypeConf implements  Serializable{
    static mapping = {
         table 'fnd_bnd_type_conf'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fund_id', params:[sequence:'fnd_bnd_type_conf_sequence']
         id generator:'identity', column:'FUND_ID'
         id column:'enddate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'source', params:[sequence:'fnd_bnd_type_conf_sequence']
         id generator:'identity', column:'SOURCE'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'bnd_type', params:[sequence:'fnd_bnd_type_conf_sequence']
         id generator:'identity', column:'BND_TYPE'
         id composite:['fundId','enddate','source','bndType'], generator:'assigned'
    }
    Long fundId
    Date enddate
    Long source
    Long bndType
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    String sourceMark
    String bndTypeMark
    java.math.BigDecimal totVal
    java.math.BigDecimal totValProp
    java.math.BigDecimal buyCost
    java.math.BigDecimal buyCostEndValProp
    java.math.BigDecimal totBndValProp
    java.math.BigDecimal totValAssetProp

    static constraints = {
        fundId(max: 9999999999L)
        enddate()
        source(max: 9999999999L)
        bndType(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
        sourceMark(size: 0..50)
        bndTypeMark(size: 0..50)
        totVal(nullable: true)
        totValProp(nullable: true)
        buyCost(nullable: true)
        buyCostEndValProp(nullable: true)
        totBndValProp(nullable: true)
        totValAssetProp(nullable: true)
    }
    String toString() {
        return "${fundId}" 
    }
}
