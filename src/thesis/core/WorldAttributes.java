package thesis.core;

/**
 *
 * @author Daniel <dmilith> Dettlaff
 */
public interface WorldAttributes {

    public enum EsizeOfItem {
        TINY, SMALL, MEDIUM, BIG, LARGE, HUGE, GIGANTIC
    };

    public enum Ematerial {
        ROTTEN_MEAT, FLESH, WATER, BONE, ALCOHOL, ACID, LAVA, FLAME, WOOD, GLASS, GRASS, ROCK, GRANITE,
        TALC, FLOUR, QUARTZ, TOPAZ, AGAT, RUBY, SAPHIRE, METAL, BRASS, SILVER, COPPER, GOLD, DIAMOND,
        COAL, METAL_ORE, COTTON, SILK, VELVET, HERB
    };

    public enum EitemAttributes {
        NORMAL, ROTTEN, HARDENED, RUNIC, UNIQUE, ENCHANTED, MAGIC, BROKEN, INDESTRUCTIBLE, ORE, SOURCE, SHARP, BLUNT
    };

    public enum EworldAttributes {
        COLD, WARM, NORMAL_GRAVITY, NO_GRAVITY, LOW_GRAVITY, HIGH_GRAVITY
    };

    public enum EbodyAttributes {
        THICK, THIN, TALL, SHORT, FAST, SLOW, TALENTED, STRONG, WEAK
    };

    public enum EbodyProfession {
        WARRIOR, ARCHER, MERCHANT, BLACKSMITH, PALADIN, FARMER, WOODCUTTER, METALURGICAL, HERBALIST, HEALER, BOWYER, FLETCHER, ARMORER, SCIENTIST, PRIEST
    };

    public enum Emagic {
        SLOW, FAST, FREEZE, BURN, LIGHT, BLIND
    };

    public enum EmaleNames {
         Christopher, Joseph, Joshua, Mark, John, Dalmar, Merhon, Gibour, Theodore, Gilbert, Mathew, Robert, Leonard, Bernard, Benedict
         , Neat, Bril, Uechu, Any, Oormy, Eraye, Sloogh, Pynd, Sers, Dayl, Enale, Ikimy, Yumi, Leard, Neab, Stealt, Leil, Edanu, Chrault, Teal
         , Idely, Craeck, Echl, Zeip, Toin, Rood, Crad, Breen, Serb, Bleinn, Iraki, Rech, Cergh, Snouph, Irrt, Opole, Nysg, Oise, Otaiy, Tan
         , Usto, Lleyl, Braub, Mack, Fool, Thaut, Veak, Awd, Uightu, Shyh, Teyr, Engut, Naliss, Rodhini, Tontina, Echsther, Roddan, Aleoc
         , Eldap, Awec, Ashbel, Stroess, Kelyves, Rakaughi, Onim, Ormryni, Thywar, Morund, Kinar, Macer, Omur, Yerir, Quoild, Swykin, Usttiai
         , Quebeli, Sweryn, Osbmos, Halor, Buack, Hatwess, Polray, Untran, Vesmosi, Agerad, Awary, Raem, Enush, Roine, Urnil, Onhin, Aughyss
         , Lyexeng, Burit, Awrusk, Taiageu, Riper, Eldzim, Torgen, Worine, Rodlmos, Issryn, Pitin, Garman, Ithata, Dien, Ruold, Luan, Rakctas
         , Echen, Alelang, Attoni, Dyndynu, Quaem, Sharad, Alextai, Snaunt, Lyeint, Oldord, Thiad, Roper, Ingtone, Artsam, Lyeeng, Rhives, Sayiss
         , Samvore, Osek, Tinzaugh, Guis, Shyxust, Peque, Ingock, Saylor, Onul, Oldwory, Rothel, Rayak, Shyrodi, Delari, Esschei, Cerhato, Saydyn
         , Therun, Tasnal, Eldenga, Banint, Rodrod, Attald, Lyeir, Lache, Teril, Adror, Tadelach, Tairiss, Swildtur, Leestash, Untloraw, Rhooskal
         , Chrocerough, Veangmor, Ustirusk, Loldban, Puiphath, Undirny, Oughnyscer, Nanntor, Eldosim, Whaomdra, Moineer, Breisir, Shortia, Chaturaugh
         , Rhakelis, Morrilkim, Nelertas, Lyeathunt, Tasaytia, Mickom, Styashsul, Lapolough, Claqor, Hiusttas, Enturler, Lewortor, Kouldeld
         , Chroshybel, Cazough, Gesulril, Taitorshy, Hinlyekin, Ardagekim, Raorurn, Shaifgar, Phylrod, Dradanom, Craquepol, Slickard, Denbaniss
         , Jaltend, Reephit, Sytherir, Whikelaw, Laghait, Engseran, Duenbel, Kaomild, Wayrtia, Chatherust, Vyiaton, Llaghar, Cleormund, Nasves
         , Umdanum, Hienusk, Whiennrad, Zherilkel, Veserach, Drontai, Thandcer, Luihdar, Druader, Naranton, Weihend, Smeeghny, Crooldwar, Ageskelton
         , Ildennal, Lyeittia, Geechald, Eldmorale, Clazad, Trightenth, Musturn, Thuchunt, Kaechis, Snirtight, Ceenthdar, Lykelight, Wheidrak
         , Serdarage, Rynachver, Kotper, Zhoser, Ageelmdan, Haemran, Ageiarad, Tutina, Nodess, Sneasen, Enthonny, Gouskhin, Wioldale, Noaret
         , Snakaline, Nysormtor, Loiphess, Vorrynlye, Liltor, Ranessar, Nadynine, Mosaughight, Thrivoryer, Creenthden, Steenyer, Nayckroth, Claikash
         , Ershytan, Moritild, Oldsayad, Schyvorbur, Loomina, Thraeqvor, Therosskel, Waulash, Phayrtser, Nylerqua, Honanhin, Enthenthden, Loitale
         , Vorialer, Rezche, Kelomden, Brorandan, Asoldine, Lycernal, Zywarther, Worquatin, Ageenthdra, Laegim, Blorakbel, Soagecha, Soighdra
         , Laewtin, Zhaeniss, Zidenack, Morserche, Rothtanper, Cradyntan, Jutonen, Zyendver, Claesshy, Omtonnys, Inaenir, Broenas, Brelyeden
         , Uyery, Dynk, Danr, Radv, Kimc, Gauw, Therw, Umy, Eene, Yathe, Smouc, Roul, Yiat, Dark, Ualde, Risc, Shyd, Etiay, Lliach, Quel, Riart
         , Tiaq, Erf, Awnn, Yashe, Ousti, Yache, Ardu, Eacku, Yers, Snym, Asn, Noiss, Neyb, Ipole, Uinge, Rhaiph, Awrt, Blair, Braul, Urisi, Aler
         , Aughy, Askely, Nourr, Chreit, Uingu, Hiend, Streurr, Risrr, Eunta, Adg, Enala, Burq, Ashnn, Elmp, Ipola, Ustch, Strier, Mosc, Pers
         , Eatha, Mosll, Itaie, Oomu, Athll, Nysh, Vort, Stew, Boch, Apoli, Aormy, Iemu, Yceru, Yhata, Snird, Rash, Oughr, Sies, Angf, Chin
         , Ingph, Iengi, Araye, Chic, Shoun, Ers, Lloed, Ryngh, Yaty, Echs, Strech, Ochao, Arr, Wuit, Neet, Fur, Skelr, Ehina, Reuck, Tass, Ward
         , Verth, Lerb, Anh, Whiak, Tys, Tauck, Issn, Ashn, Quer, Iessi, Morg, Osl, Kayst, Ihona, Aryna, Dayf, Yerth, Ghat, Itk, Sulm, Tasd
         , Throos, Amoro, Rynb, Neyl, Samn, Inar, Nyf, Llec, Add, Sleir, Aundy, Aose, Ydyno, Odyni, Rodnd, Evero, Uore, Anld, Iquau, Athu
         , Ichei, Lit, Enh, Ynale, Chuq, Saf, Uari, Vesph, Atm
    };

    public enum EfemaleNames {
        Luthri, Arion, Rhindel, Ceneris, Armeya, Aca, Arma, Atha, Atma, Aundia, Ondi, Uora, Athu, Araye
    };

    public enum Esex {
       Male, Female, Hermaphrodite
    };

    public enum Eraces {
       Human, Dwarf, Elve, Gnome, Giant, Troll, Ogre, Orc, Spider, Bear, Wolf, Goat, Cow, Dragon, Elemental
    };

}
