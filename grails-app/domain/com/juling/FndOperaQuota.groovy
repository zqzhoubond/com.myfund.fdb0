/**
 * The FndOperaQuota entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndOperaQuota implements  Serializable{
    static mapping = {
         table 'fnd_opera_quota'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_opera_quota_sequence']
         id generator:'identity', column:'INNER_CODE'
         id column:'declaredate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'quota_obj', params:[sequence:'fnd_opera_quota_sequence']
         id generator:'identity', column:'QUOTA_OBJ'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'sell_type', params:[sequence:'fnd_opera_quota_sequence']
         id generator:'identity', column:'SELL_TYPE'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'quota_cls', params:[sequence:'fnd_opera_quota_sequence']
         id generator:'identity', column:'QUO_CLS'
         id composite:['innerCode','declaredate','quotaObj','sellType','quotaCls'], generator:'assigned'
    }
    Long innerCode
    Date declaredate
    Long quotaObj
    Long sellType
    Long quotaCls
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date startDate
    Date endDate
    String quotaObjMark
    String sellTypeMark
    String quotaClsMark
    java.math.BigDecimal quota
    Long quotaUnit
    String quotaUnitMark
    Long ifContFee
    Long ifNews

    static constraints = {
        innerCode(max: 9999999999L)
        declaredate()
        quotaObj(max: 9999999999L)
        sellType(max: 9999999999L)
        quotaCls(max: 9999999999L)
        seq(nullable: true, max: 9999999999L)
        ctime(nullable: true)
        mtime(nullable: true)
        isvalid(nullable: true)
        geniusUid(nullable: true, max: 9223372036854775807L)
        startDate(nullable: true)
        endDate(nullable: true)
        quotaObjMark(size: 0..20)
        sellTypeMark(size: 0..20)
        quotaClsMark(size: 0..50)
        quota(nullable: true)
        quotaUnit(nullable: true, max: 9999999999L)
        quotaUnitMark(size: 0..20)
        ifContFee(nullable: true, max: 9999999999L)
        ifNews(nullable: true, max: 9999999999L)
    }
    String toString() {
        return "${innerCode}" 
    }
}
