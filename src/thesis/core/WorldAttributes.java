package thesis.core;

/**
 *
 * @author Daniel <dmilith> Dettlaff
 */
public interface WorldAttributes {

    /**
     * enums for every possible action in the game for every object.
     */
    public enum EActionType {
        ActionAttack, ActionRun, ActionWalk, ActionTurn, ActionEatOrDrink, ActionSleep
    };

    public enum EcoordinateBase {
        Soil, Rock, Grass, Desert, Snow, Ice, Water, Lava, Acid, Stone, Wood
    };

    public enum EsizeOfItem {
        Tiny, Small, Medium, Big, Large, Huge, Gigantic
    };

    public enum Ematerial {
        Rotten_Meat, Flesh, Water, Bone, Alcohol, Acid, Flame, Wood, Glass, Rock, Granite,
        Talc, Flour, Quartz, Topaz, Agat, Ruby, Saphire, Iron, Brass, Silver, Copper, Gold, Diamond,
        Coal, Cotton, Silk, Velvet, Herb, Clay
    };

    public enum EitemAttribute {
        Normal, Rotten, Hardened, Runic, Unique, Enchanted, Magic, Broken, Indestructible, Ore, Source, Sharp, Blunt
    };

    public enum EworldAttribute {
        Cold, Warm, Normal_Gravity, No_Gravity, Low_Gravity, High_Gravity
    };

    public enum EbodyAttribute {
        Thick, Thin, Tall, Short, Fast, Slow, Talented, Strong, Weak
    };

    public enum EbodyProfession {
        Warrior, Archer, Merchant, Blacksmith, Paladin, Farmer, Woodcutter, Herbalist, Healer, Bowyer
          , Fletcher, Armorer, Priest, Warlock, Mage, Thief, Alchemist, Enchanter
    };

    public enum Emagic {
        Slow, Fast, Freeze, Burn, Light, Blind, Telekinesis
    };

    public enum EmaleName {
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
         , Ichei, Lit, Enh, Ynale, Chuq, Saf, Uari, Vesph, Atm, Poundem, Enthranech, Lyeoughash, Smouneng, Fitonpol, Shahinir, Goizhin, Untissper
         , Ashcheden, Phyquarod, Chraorlye, Schialdmos, Eldadim, Tonkinser, Trorilir, Suwarold, Ruangsam, Blianton, Uskrilir, Coonser, Nineshy
         , Tayeret, Sausor, Litinom, Osrothach, Ciayit, Oughildpol, Ildurnen, Sitasiss, Lyekinight, Hosulom, Smarrod, Liormris, Reekash, Thrailten
         , Masenth, Rhaultine, Ersamtor, Honemril, Soonban, Theraughdyn, Yevorach, Tetiaia, Dredynris, Emtheryer, Morechrod, Athkimrak, Giriset
         , Natasem, Hauwaw, Cheoldar, Gatintia, Meter, Kivesrod, Rothaughenth, Wiurnmor, Itrilryn, Snoechbur, Drachawar, Ardtanrad, Lorisskel
         , Natasper, Lorvermos, Tonhatche, Niald, Phophvor, Serhatenth, Ceineold, Huoughit, Lukelage, Snyserche, Zhutherkal, Hegbel, Ridny, Swoshyest
         , Haveria, Olddelbel, Inatinshy, Yuntaugh, Katonend, Arathem, Blochais, Slyrynlor, Yenat, Tyingper, Jiesskal, Rodasden, Garrileng
         , Rynorhat, Daughche, Etlerorm, Ghaustroth, Thryiakel, Awtursul, Sagum, Noonim, Ranengough, Inaelmqua, Weacund, Snoopgha, Toncerit
         , Naimsay, Alemosust, Untingight, Swouchrad, Rynelmir, Lykelris, Nierale, Bloashorm, Suinbur, Gychait, Rulos, Turbelend, Nopolack
         , Rhuincer, Briater, Swiedeld, Ustpolrod, Nyalegha, Neendorm, Noisser, Yoephend, Neildran, Orkimrak, Throghaem, Cuiltad, Voranon
         , Agetinit, Whuphage, Torerlye, Letasdan, Atormbur, Deilmos, Lerdrait, Torenshy, Enemmos, Rhoikach, Wardenem, Ghavorath, Undrakves, Daurnryn
         , Lopurn, Dossqua, Garhonust, Beyrund, Yeusser, Caormcha, Steirron, Wheeptai, Cootard, Ateldom, Schonngha, Zairust, Suirdban, Strarodtor, Orhinight
         , Danaleir, Staelpol, Soustsay, Banbelgar, Bysage, Inaoughban, Ageirorm, Siawem, Ildergha, Lyeasroth, Snaishdra, Bribim, Lorkimdar
         , Droirdcer, Mothertur, Llaesbel, Feystim, Kichagha, Galale, Essenglor, Ronysmos, Rothtaitas, Essosgar, Ceyteng, Ackmorale, Juaughdyn
         , Zuvoret, Sordest, Bibeltia, Chrekalest, Yuhonurn, Polinaeng, Quaildough, Kialdem, Saestunt, Trendler, Nonyswor, Leyend, Chepom
         , Buicheng, Roantas, Fiuntir, Sasad, Burlyeough, Niurnon, Truardwar, Enthoughough, Rilmorves, Athiser, Estskelmor, Sonttai, Inaestia
         , Witen, Masine, Smoomtia, Kuvther, Threventh, Schyechran, Aldirkal, Moraughem, Sasercha, Ranrilhat, Boonorm, Rynverche, Omdelcer
         , Nolerang, Uskimgha, Hinsulrod, Rheypqua, Riburas, Taiworeng, Hinperald, Taesttin, Clooyest, Elmanen, Triashroth, Struageight
         , Keilnal, Rynawny, Mosemsay, Chroohom, Nydanaw, Reupar, Throunard, Lauyelm, Whioldroth, Zeineurn, Thockash, Aragetai, Imendan
         , Yidrany, Schinewar, Telyetor, Butiaech, Surilkal, Saminaorm, Slamorris, Torathpol, Letdyn, Phouhold, Laendser, Quiteng, Engperelm
         , Vooughorm, Muawser, Ciessan, Ranonim, Zyltat, Wuardem, Tanustkel, Chraristas, Levunt, Phyraywar, Pourang, Siqia, Risquavor
         , Nahonsul, Atlyeech, Jowves, Chronat, Lightenth, Nuldgha, Dorantas, Rothtanbur, Riyerrod, Stooyon, Tobanhat, Whuceror, Denyerper
         , Raerest, Turmorine, Nyasest, Iabanash, Dartiaom, Pysskel, Risvorine, Threvorbur, Riepche, Breytan, Rhoustton, Seinntia, Llarodan
         , Inaisurn, Chetia, Draldsay, Sweufgar, Fuighttur, Thrickdel, Cercherod, Rodnalmor, Strinhon, Saradnys, Umrodsam, Aledraina, Stiastvor
         , Swoilray, Veriaeng, Rhunyack, Tounight, Naengwor, Daundban, Loosend, Aledanaw, Darver, Shyoughwar, Nyschaet, Laendan, Whaidaugh
         , Lashorm, Smoithess, Danhinom, Kimildem, Schyntia, Snoogorm, Hiskeldar, Rytasest, Poldang, Danperine, Nechashy, Mietum, Lykalunt
         , Rayomskel, Tagarat, Lleashem, Torquekin, Elmettai, Clokinlor, Quachaunt, Huickaugh, Toinril, Sluemos, Oldcerrod, Soororm, Danessran
         , Lerhonque, Ceaphran, Ashyertia, Shinalild, Sneengche, Smoushtor, Cauntine, Rynbelath, Quesale, Dialdiss, Ingingon, Oldadban
         , Teashis, Slyldves, Urnserim, Endsulmor, Keacking, Tanverough, Dapoller, Waturskel, Thoilvor, Laiache, Issradmor, Hiachryn
         , Nayrskel, Lisulroth, Elmoman, Reultyer, Wosulwar, Untperelm, Smeania, Craebhon, Llurtest, Vorranyer, Llaepar, Zhighther, Schadaning
         , Issraytan, Radenkin, Smoucar, Threalnal, Achkelche, Dradenler, Jultton, Onlergar, Chogeng, Zhanny, Ludynack, Tannbur, Achonen
         , Nierdler, Toiltai, Burustage, Seennver, Honitom, Waqhat, Dobelkel, Smaskelorm , Anmorqua, Waremach, Aughrothar, Rothelmina
         , Skelumdar, Batairan, Achvorina, Doovine, Angwarton, Kalormril, Skelormtia, Cluagetai, Smethdra, Umenran, Derisper, Niekia
         , Lykimech, Zekelpol, Gyirold, Kaldardar, Drauthlor, Reannat, Breisad, Coothqua, Issranine, Nidynryn, Tephcha, Schatorina
         , Ciyerough, Chesamcha, Zoompol, Tihonen, Drichroth, Moskelold, Torser, Physril, Stryradas, Veachgha, Huiltque, Arverelm, Clythrak
         , Gearddan, Lerendet, Thradet, Eldthermos, Emoughight, Ledynsul, Triengril, Zotorer, Stoghawor, Rainris
    };

    public enum EfemaleName {
        Luthri, Arion, Rhindel, Ceneris, Armeya, Aca, Arma, Atha, Atma, Aundia, Ondi, Uora, Athu, Araye, Aya, Makube, Sukume, Saar
        , Slarin, Sast, Svisathen, Nenus, Fenin, Inthynrg, Fenen, Senyn, Sthenkayn, Svisyrast, Kelys, Svus, Sthenus, Sithyn, Nenathin
        , Svens, Tinkaus, Ythkayn, Ssenisen, Synyrrlra, Nenens, Sythzon, Fenra, Svisys, Ythynys, Estin, Tinislin, Sthentysast, Kelyrith, Svithra
        , Issenus, Ssilenen, Sven, Ssra, Fenrg, Thenasten, Sus, Ssathith, Senzon, Sithisyn, Senen, Nenynyn, Ssellen, Estynyn, Ssthyrrg, Svisithus
        , Sen, Sofen, Ssenens, Suss, Sithith, Ssilast, Sithasten, Sith, Corofen, Ssthislast, Svynin, Issisens, Senys, Ssthiyast, Isstysyn, Ssthisrg
        , Ssyn, Nenyna, Slarellys, Estastin, Inthen, Thenisith, Sythiszon, Nenensi, Tinen, Sastith, Issyn, Isskaen, Ssenys, Issra, Svisyrin
        , Sskast, Ssalle, Senenyn, Sseniys, Sithkara, Sveszon, Ssthus, Salith, Siys, Estzon, Svelthast, Ssus, Neniys, Ssilastith, Ssilen
        , Senynte, Ssen, Ssilathen, Sthenyn, Estyrra, Thenithle, Ssrg, Ithenra, Ithynen, Inthathith, Issast, Senyryn, Inthyn, Sthenle
        , Senisen, Chadosia, Chadjask, Mindassa, Iskassasta, Lisim, Smulilsala, Lirtimla, Sundilsa, Chamim, Assim, Feynast, Lassossa, Frichimla
        , Stodadar, Sondirra, Frichjask, Mindosian, Lassjasksda, Ilaststa, Undistan, Marimla, Jiskadar, Jiskimsya, Jiskirra, Sundyqanya
        , Marimsya, Nolastsda, Frichossa, Lisast, Sondilsanya, Lirtowiya, Lassakunya, Jiskirran, Iskassa, Mindim, Lirtassaya
        , Lisassasda, Lisjask, Lirtirranya, Iskjasksda, Riechosianya, Maradar, Frichossan, Sundast, Lisista, Iljask, Ililsa
        , Chanilsasta, Lirtassa, Swiashimsda, Mindychy, Iladar, Assassa, Lirtimnya, Iskadarsta, Chamistaya, Chanassasta, Maradarla
        , Mindirrasta, Lassast, Sondiman, Lisadarst, Jisketunya, Frichosia, Chadegeya, Iskilsa, Frichosianya, Marulenya, Sundassala
        , Chanebu, Phourtossasya, Sondosia, Lisimst, Chanista, Frichista, Chamimnya, Loiwimla, Chamadarsta, Sondastya, Frichast, Chanastla
        , Chadege, Chadilsaya, Chamosia, Loeghastya, Chamosiasta, Lisilsa, Lisirrasya, Chadadar, Chadilsa, Chamassala, Sondossa
        , Clokjaskan, Undim, Chamirrala, Chadim, Lisosiasda, Chanosia, Mindadar, Mindast, Sundossa, Ilalasta, Lirtosiasya, Ilimnya
        , Lirtilsala, Dryrista, Ilirrala, Undista, Lisopy, Chamirraya, Iskistan, Jiskastsda, Mindadarsya, Keindistaya, Sondjasksya
        , Jiskadarsta, Mindosia, Chadassa, Chamossasda, Assistanya, Mindastya, Lirtosiala, Ilosia, Chadassala, Lisosia, Caustistan, Sundimst
        , Mindjasknya, Teantjask, Lisjasksya, Undirrast, Lisilsan, Chamilsa, Lirtjask, Chanadarya, Marosia, Chanirranya, Assosia
        , Mindastla, Sundassasda, Chameghosta, Assossa, Lisamosta, Frichassanya, Assista, Sundirran, Mindirra, Assistast, Ilirra, Assastla
        , Ilastsda, Assistasda, Frichjasksya, Mindistasta, Iskadar, Chamirra, Iskiman, Chadista, Sondosianya, Lirtirrasya, Chanistasta, Undaststa
        , Assikist, Undast, Lirtadar, Sundilsasya, Lassim, Chaniman, Frichadar, Sondadar, Undistasta, Marossasya, Chadirra, Lirtim, Sondassa
        , Chamossasya, Sondjasknya, Chamast, Trihossa, Chamikost, Jiskista, Sondistaya, Undyhe, Assassast, Chamistasda
        , Phaesriru, Raeduesu, Pharirgue, Phiralstiru, Iada, Haithesuir, Aellyriadru, Reuna, Yalallocal, Sirith, Philaelis, Phainarap
        , Ailosu, Aelaedru, Tyeudam, Yarim, Aerith, Yasurria, Hilasti, Yasursurap, Aedairiaru, Seostynu, Euralsulis, Ralaphos
        , Ialo, Aeralrin, Lirith, Aestyrian, Idairia, Irithnu, Iali, Aesri, Iduesun, Sirithdil, Shurkaki, Chimkaki, Chajuz, Chathnai
        , Shushurru, Shujesh, Nanect, Shuthict, Yimkare, Shushural, Ksajal, Shuyural, Chidduz, Narkichi, Chorkare, Ksarrakra, Shuneni
        , Chasheni, Choddaja, Chirkus, Shuyesh, Choshiru, Chimkaja, Natheni, Berkakra, Yinict, Beddeni, Bemkel, Yijurru, Chimkare
        , Beshict, Ksathural, Shurrel, Shurkakra, Choyus, Najuz, Choddnai, Bemkurru, Beddichi, Berraja, Yirkural, Shujash, Choshesh, Chishural
        , Chiddnai, Anral, Yiyel, Shuthural, Shushichi, Inanura, Hiaralrgue, Eostyrap, Ralaerin, Seolinurin, Aithesu, Eosririaphos, Haistyllocal
        , Eully, Tyirith, Seuri, Ina, Reulae, Sialaedru, Irallop, Phyasristi, Biqajak, Ajaqa, Etzlij, Kabak, Qaqalaj, Namtomin, Tstomich
        , Chajenaj, Ajij, Kalasak, Namaj, Ixanal, Azajaqa, Tzich, Tsende, Azilij, Jolojin, Etzojende, Etzlam, Izlil, Ajimak, Aztomich
        , Chtomaqa, Jolawak, Biqek, Jolin, Ajende, Etzlin, Kalawaqa, Kalilaqa, Etzlende, Ajak, Lanolak, Ixawaj, Jajajak, Ixich, Lanilos
        , Chimaqa, Gahnich, Etzojim, Biqanil, Kaloyelja, Tzek, Chaqa, Biqelja, Ixim, Tsasek, Qaqyesak, Kachysal, Ixam, Izlende, Izlix
        , Kacholos, Namich, Kachenij, Ajyesich, Chajal, Etzal, Izlilil, Chajawak, Qaqasin, Biqal, Ixin, Ajal, Jolich, Izlenal, Namal
        , Tzal, Gahnak, Namam, Jolak, Lanimaj, Kachelja, Kalij, Kachich, Lanim, Biqix, Ajich, Gahnolos, Etztomil, Kalek, Tzam, Etzelja, Tzak
        , Etzende, Ajix, Azelja, Namalal, Izlyeselja, Biqimaqa, Izlyesil, Kalam, Gahnaqa, Izlim, Ajasix, Chenaj, Ixos, Ajek, Tsenak, Chajyeselja
        , Kachyesaj, Etzlajak, Jajak, Jajalin, Lanyesal, Kachak, Kalaj, Qaqaqa, Kabyesij, Jolanaj, Biqalix, Lanal, Kachal, Ixtomaqa, Jajasak
        , Etzij, Izlolak, Lanilak, Etzin, Jajojak, Etzlek, Tzimek, Gahnal, Lanasil, Tsaqa, Lanimek, Ajelja, Jajich, Ajajix, Namyesal, Chos
        , Tzasich, Kabyesal, Ixawal, Qaqalende, Tsayelja, Etzayil, Jolil, Elliel, Calelaren, Ellaren, Alriel, Sharishul, Shalael, Calalulash
        , Cherin, Avisheven, Avalulash, Shalulatar, Elladur, Valishul, Sharaia, Relishul, Shalaradur, Raleleven, Relerin, Chael, Shaia
        , Ellishaeish, Laenalatar, Alrishatar, Sharerin, Relaeish, Assilsa, Undjask, Chamjask, Chamossaya, Undossa, Sondjask, Iskjasknya, Frichistaya
        , Jiskosiasda, Jiskiman, Mindirran, Chamirrasta, Lisirra, Lirtirra, Lirtassanya, Iskistala, Sundadar, Jiskim, Jiskassasya, Sondilsasta
        , Iskirrasda, Sondista, Assjasknya, Chanossa, Chanastsda, Frichosiala, Mindirrasya, Booladar, Chamosiast, Lisossan, Ilosiasya, Lisarosya
        , Lassjasksya, Marossaya, Iljasknya, Mindjasksda, Beecossa, Laenielaia, Relulaia, Ralalatar, Valaith, Showaith, Laenadur, Chiel
        , Ralareven, Sharielaren, Averin, Avishul, Alrahur, Shalowatar, Lisimsta, Iskossast, Maristasya, Sondastst, Chanackinya, Mindossast
        , Chadistaya, Mindistanya, Undilsa, Sautjask, Lassilsast, Lisadarsya, Ilidusda, Undjasksda, Frichadarst, Sondim, Undassa
        , Frichilsasda, Smoildista, Lisadar, Marirra, Marjasknya, Iladaran, Chamossa, Marassan, Ilubinya, Bechistast, Assimsya, Sondosian
        , Sondadarsta, Assedast, Chamilsast, Marista, Chaduto, Sondastla
    };

    public enum Esex {
       Male, Female, Hermaphrodite
    };

    public enum Erace {
       Human, Dwarf, Elve, Gnome, Giant, Troll, Ogre, Orc, Spider, Bear, Wolf, Goat, Cow, Dragon, Water_Elemental, Fire_Elemental
         , Clay_Elemental, Rock_Elemental
    };

    public enum EexperienceLevel {
       Novice, Beginner, Intermediate, Advanced, Expert, God
    };

}
