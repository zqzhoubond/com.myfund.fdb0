/**
 * The FndStkSumConf entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndStkSumConf {
    static mapping = {
         table 'fnd_stk_sum_conf'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'stk_inner_code', params:[sequence:'fnd_stk_sum_conf_sequence']
         id generator:'identity', column:'STK_INNER_CODE'
        endDate column: 'ENDDATE'
        declareDate column: 'DECLAREDATE'
    }
    Long stkInnerCode
    Long version
    Date declareDate
    Date endDate
    Long fundId
    Long hldStkSum
    String hldStkVal
    String plaPct
    Long source
    String totValProp

    static constraints = {
        stkInnerCode(max: 9999999999L)
        version(max: 9223372036854775807L)
        declareDate(nullable: true)
        endDate()
        fundId(max: 9999999999L)
        hldStkSum(max: 9999999999L)
        hldStkVal(size: 0..18)
        plaPct(size: 0..18)
        source(max: 9999999999L)
        totValProp(size: 0..18)
    }
    String toString() {
        return "${stkInnerCode}" 
    }
}
