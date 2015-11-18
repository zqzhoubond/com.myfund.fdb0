/**
 * The AnaFndExFactor entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class AnaFndExFactor {
    static mapping = {
         table 'ana_fnd_ex_factor'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id column:'EX_DATE'
        endDate column: 'ENDDATE'
    }
    Date exDate
    Long version
    String cumFactor
    Date endDate
    String exFactor
    Long factorType
    Long innerCode
    Date regiDate
    String regiDateNetVal
    String unitDiv
    String unitIncrPorp
    String unitNet
    String unitNetOrig
    String unitSpPorp

    static constraints = {
        exDate()
        version(max: 9223372036854775807L)
        cumFactor(size: 0..15)
        endDate(nullable: true)
        exFactor(size: 0..15)
        factorType(max: 9999999999L)
        innerCode(max: 9999999999L)
        regiDate(nullable: true)
        regiDateNetVal(size: 0..9)
        unitDiv(size: 0..15)
        unitIncrPorp(size: 0..15)
        unitNet(size: 0..9)
        unitNetOrig(size: 0..9)
        unitSpPorp(size: 0..15)
    }
    String toString() {
        return "${exDate}" 
    }
}
