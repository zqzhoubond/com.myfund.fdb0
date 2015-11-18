/**
 * The FndMnyIncm entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndMnyIncm {
    static mapping = {
         table 'fnd_mny_incm'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'vol_grd', params:[sequence:'fnd_mny_incm_sequence']
         id generator:'identity', column:'VOL_GRD'
        declarDate column: 'DECLAREDATE'
        endDate column: 'ENDDATE'
        yearVld column: 'YEAR_VLD'

    }
    Long volGrd
    Long version
    Date declarDate
    Date endDate
    Long innerCode
    String nav
    String tenthouUnitIncm
    String yearVld

    static constraints = {
        volGrd(max: 9999999999L)
        version(max: 9223372036854775807L)
        declarDate(nullable: true)
        endDate()
        innerCode(max: 9999999999L)
        nav(size: 0..18)
        tenthouUnitIncm(size: 0..12)
        yearVld(size: 0..9)
    }
    String toString() {
        return "${volGrd}" 
    }
}
