/**
 * The FndNetVal entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndNetVal {
    static mapping = {
         table 'fnd_net_val'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         id column:'END_DATE'
        declareDate column: 'DECLAREDATE'

    }
    Date endDate
    Long version
    String accumNet
    String adjUnitNet
    String adjUnitOrig
    Date declareDate
    String gr
    Long innerCode
    String nav
    String unitDistIncm
    String unitNet
    String unitNetOrig

    static constraints = {
        endDate()
        version(max: 9223372036854775807L)
        accumNet(size: 0..9)
        adjUnitNet(size: 0..9)
        adjUnitOrig(size: 0..9)
        declareDate(nullable: true)
        gr(size: 0..6)
        innerCode(max: 9999999999L)
        nav(size: 0..18)
        unitDistIncm(size: 0..9)
        unitNet(size: 0..9)
        unitNetOrig(size: 0..9)
    }
    String toString() {
        return "${endDate}" 
    }
}
