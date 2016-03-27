BEGIN TRANSACTION;
CREATE TABLE "family_de" (
	`_id`	INTEGER,
	`name`	TEXT NOT NULL,
	`scientific_name`	TEXT,
	`flower_formula`	TEXT,
	`flower_type`	TEXT,
	`flower_perianth`	TEXT,
	`flower_stamen`	TEXT,
	`flower_ovary`	TEXT,
	`flower_sepal`	TEXT,
	`flower_petal`	TEXT,
	`fruit`	TEXT,
	`sorus`	TEXT,
	`leaf`	TEXT,
	`involucro`	TEXT,
	`stipule`	TEXT,
	`morphology`	TEXT,
	`ingredients`	TEXT,
	`misc`	TEXT,
	PRIMARY KEY(_id)
);
INSERT INTO `family_de` VALUES (1,'Narzissengewächse','Amaryllidaceae','r P3+3 A3+3 G(3)','radiär','Perigon aus 2 dreizähligen Kreisen, frei oder verwachsen, zuweilen mit
Nebenkrone','2 Kreise mit je drei Staubblättern','1, unterständig, coenocarp aus 3 Fruchtblättern, dreifächrig','---','---','Kapseln, selten Beeren','---','einfach, oft schmal linealisch, ganzrandig - ohne Lauchgeruch','---','---','Zwiebel-, selten Knollengeophyten','Amaryllidaceen-Alkaloide z.B. Galanthamin','- Unterscheidung von den Liliengewächsen durch den unterständigen Fruchtknoten, von den Schwertliliengewächsen durch die doppelte Zahl an Staubblättern (6 statt 3)');
INSERT INTO `family_de` VALUES (2,'Schwertliliengewächse','Iridaceae','r bis z P3+3 A3 G(3)','radiär, selten leicht zygomorph (Gladiole)','Perigon aus 2 dreizähligen Kreisen, frei oder verwachsen','1 Kreis mit drei Staubblättern','1, unterständig, coenocarp aus 3 Fruchtblättern, dreifächrig','---','---','Kapseln','---','grasartig schmal oder schwertförmig','---','---','Rhizom-, Knollen- und Zwiebelgeophyten, ausdauernd','Triterpensaponine
Crocetin (Carotinoidsäure in Verbindung mit Zucker) = Safran; seltene Substanz, Verwendung als Gewürz-, Farb- und Heilmittel, gewonnen aus den Narben von Crocus sativus (Herbstkrokus - Persien, Indien)','- Unterscheidung von den Liliaceae durch den Wegfall eines Staubblattkreises und den unterständigen Fruchtknoten
- Unterscheidung von den Amaryllidaceae durch den Wegfall eines Staubblattkreises');
INSERT INTO `family_de` VALUES (3,'Liliengewächse','Liliaceae','r P3+3 A3+3 G(3)','radiär','Perigon aus 2 dreizähligen Kreisen','2 dreizählige Kreise','1, oberständig, coenocarp aus 3 Fruchtblättern, dreifächrig','---','---','Kapsel','---','einfach, sitzend, wechselständig bis scheinquirlig','---','---','Stauden mit unterirdischen Erneuerungsknospen (Geophyten), die an unterirdischen Speicherorganen sitzen
Zwiebel-, selten Rhizompflanze','z.T. Chelidonsäure, Steroidsaponine','- bis 2010 wurden folgende Gattungen unter den Liliengewächsen zusammengefasst; diese bilden nun eigenständige Familien (aber gleiche Blütenformel)
- Lauchgewächse (Alliaceae): Küchenzwiebel, Porree, Lauch (Allium); Lauchgeruch, B in Dolden
- Hyacinthengewächse (Hyacinthaceae): Blaustern (Scilla); Hyazinthe (Hyacinthus), Traubenhyazinthe (Muscari), Milchstern (Ornithogalum); Zwiebelpfl. ohne Lauchgeruch, B blau
- Grasliliengewächse (Anthericaceae): Graslilie (Anthericum)
- Mäusedorngewächse (Ruscaceae): Schattenblume (Majanthemum); Maiglöckchen (Convallaria); Salomonsiegel (Polygonatum)
- Tagliliengewächse (Hemerocallidaceae): Taglilie (Hemerocallis), Rhizom, B gelb, orange
- Zeitlosengewächse (Colchicaceae): Herbstzeitlose (Colchicum)');
INSERT INTO `family_de` VALUES (4,'Veilchengewächse','Violaceae','z oder r K5 C5 A5 G (3)','dorsiventral mit Sporn oder radiär','5 freie Kelchblätter, 5 freie Kronblätter','5','1, oberständig, aus 3 Fruchtblättern verwachsen, 1 Griffel, oft s-förmig gebogen, Narbe sehr vielgestaltig','5 freie','5 freie','Kapseln, dreiklappig, vielsamig, Samen mit Ölkörper','---','wechselständig, mit Nebenblättern (manchmal nur am Grund, meist herzförmig)','---','meist herzförmig, manchmal nur am Grund','Kräuter, Sträucher, in den Tropen Bäume und Lianen','---','---');
INSERT INTO `family_de` VALUES (5,'Kreuzblütengewächse','Brassicaceae','d bis r K4 C4 A2+4 G(2)','disymetrisch oder radiär, meist in Trauben','4 freie Kelchblätter; 4 freie Kronblätter, bilden Blütenkreuze','2 Kreise, der äußere mit 2 kurzen, der innere mit 4 langen Staubblättern','1, oberständig, coenocarp aus 2 Fruchtblättern, zweifächrig, getrennt durch eine falsche Scheidewand','4 freie','4 freie, bilden Blütenkreuze, können gespalten sein','Schötchen oder Schoten - wenn weniger/mehr als dreimal so lang wie breit, Fruchtblätter lösen sich beim Öffnen von der falschen Scheidewand','---','wechselständig, keine Nebenblätter, oft tief fiederspaltig','---','---','Kräuter und Stauden, sehr selten Gehölze','Senfölglycoside, bei Verletzung der Pflanze Freisetzung der stechend riechenden Senföle nach der Reaktion mit dem Enzym Myrosinase','---');
INSERT INTO `family_de` VALUES (6,'Hahnenfußgewächse','Ranunculaceae','r bis z K2-∞ C5-∞ (oder P) A∞ G1-∞','radiär bis zygomorph','Blütenblätter frei, Perigon oder Perianth, Kronblätter (oder
kronblattartige Perigonblätter) häufig mit Nektardrüsen oder kronblattartige, stark glänzende Nektarblättern (= umgebildete Staubbeutel)','viele','einer bis viele, oberständig','2 bis viele','5 bis viele','Nüsschen (Gattung Hahnenfuß), Balgfrüchte, selten Beeren','---','wechsel- oder grundständig (nur Waldrebe gegenständig), oft handförmig geteilt oder zusammengesetzt; Blattstiel am Grund scheidig, keine Nebenblätter – höchstens sehr kleine','---','keine, höchstens sehr kleine','Kräuter, Stauden, selten Gehölze (Waldrebe)','oft Gifte z.B. Protoanemonin beim Hahnenfuß oder Aconitin beim Eisenhut','- einige Vertreter (Hahnenfuß) ähneln auf dem ersten Blick sehr den Rosaceae (v.a. durch die 5 Blütenblätter und vielen Staubblätter)
- Unterscheidungsmerkmal zu den Rosengewächsen: Hahnenfußgewächse haben mitunter gespornte Blüten und sehr oft Nektarblätter, beide Merkmale kommen bei den Rosengewächsen nie vor; typisch für die Rosengewächse ist dagegen oft ein Außenkelch und Nebenblätter, was bei den Hahnenfußgewächsen äußerst selten auftritt');
INSERT INTO `family_de` VALUES (7,'Nelkengewächse','Caryophyllaceae','r K(5) oder 5 C5 A5 oder 5+5 G(5)','radiär, in Dichasien','5 Kelchblätter z.T. verwachsen; 5 Kronblätter (selten Blüte 4zählig)','1 Kreis mit 5 Staubblättern oder 2 Kreise mit je 5 Staubblättern','1, oberständig, coenocarp aus 5 Fruchtblättern, fünffächrig','5, zum Teil verwachsen','5, können so tief eingeschnitten sein, dass sie 10 vortäuschen','meist Kapseln','---','einfach, meist ganzrandig und oft schmal, fast stets gegenständig, teils mit Nebenblättern','---','teilweise','Kräuter und Stauden','verbreitet oberflächenaktive Triterpensaponine (Seifenwirkung) z.B. Gypsogenin','- wenn röhrig verwachsene Kelchblätter, dann Kronblätter mit schmalem Abschnitt in der Kronröhre (Nagel) und breiten Abschnitt (Platte)
- wenn freie Kelchblätter, dann oft tief zweispaltige Kronblätter und oft Ausfall eines Staubblattkreises und mit häutigen Nebenblättern');
INSERT INTO `family_de` VALUES (8,'Lippenblütengewächse','Lamiaceae','z K(5) [C(5) A2+2] G(2)','zygomorph','5 verwachsene Kelchblätter, Kelch manchmal zweilippig; 5 verwachsene
Kronblätter, 3 bilden die Unterlippe, 2 die Oberlippe','4, paarweise mit verschieden langen Filamenten, Filamente mit den
Kronblättern verwachsen','1, oberständig, coenocarp aus 2 Fruchtblättern, seine 2 Fächer werden
durch eine falsche Scheidewand in 4 Klausen geteilt, zwischen denen
der Griffel steht','5 verwachsene','5 verwachsene, 3 bilden Unterlippe, 2 die Oberlippe','4 einsamige Teilfrüchte (Klausen)','---','ungeteilt, kreuzweise gegenständig, selten quirlig, ohne Nebenblätter,
an vierkantigem Stängel','---','---','Kräuter, Stauden, Sträucher','ätherische Öle in Drüsenhaaren und -schuppen, Heil- und Gewürzpflanzen','---');
INSERT INTO `family_de` VALUES (9,'Storchschnabelgewächse','Geraniaceae','r K5 C5 A5+5 G(5)','radiär','jeweils 5 freie Kelch- und Kronblätter','2 Kreise mit je 5 Staubblättern','1, oberständig, coenocarp aus 5 Fruchtblättern','5 freie','5 freie','- Spaltfrüchte, in je 5 schnabelartig verlängerte einsamige Teilfrüchte zerfallend
- bei Reife rollen sich die Schnabelteile des lang ausgezogenen Fruchtknotens auf und schleudern dabei Samen fort - Streufrucht','---','wechselständig, handnervig, Nebenblätter stets vorhanden','---','immer vorhanden','Kräuter und Stauden','---','---');
INSERT INTO `family_de` VALUES (10,'Korbblütengewächse','Asteraceae','r bis z K5 [C(5) A5] G(2)','radiär bis zygomorph, zu mehreren bis vielen auf kugeliger, scheibenförmiger oder krugartiger Blütenstandsachse (Korbboden), die so gebildeten Blütenstände können Einzelblüten vortäuschen, Tragblätter der Einzelblüten sind oft zu borstenartigen Spreublättern umgewandelt oder fallen aus','Die ursprünglichen 5 Kelchblätter fehlen oder sind zu haarartigen
Gebilden, dem Pappus, umgewandelt, der Pappus kann zu Flughaaren der Samen auswachsen (Löwenzahn) oder grannenartig o. schuppenförmig umgebildet; 5 oder 3 verwachsene Kronblätter, die bei Zungenblüten (= Strahlenblüten) flächig verwachsen sind oder bei Röhrenblüten röhrig oder trichterförmig verwachsen sind','5, die Staubbeutel verwachsen an den Längsseiten zu einer den Griffel
umschließenden Röhre','1, unterständig, coenocarp aus 2 Fruchtblättern, einfächrig','ursprünglich 5: fehlen oder zu Pappus umgewandelt','5 oder 3, verwachsen (flächig: Zungenblüten, röhrig: Röhrenblüten)','einsamige Schließfrüchte, bei der (ähnlich wie bei den Gräsern) Samen- und Fruchtschale miteinander verwachsen sind','---','wechselständig, ohne Nebenblätter','Korb, der von Hüllblättern umgeben ist, manchmal noch zusätzlich Außenhüllblätter','---','Kräuter und Stauden, in niederen Breiten auch Gehölze','---','- Gliederung in zwei Unterfamilien:
- Cichorienartige (Cichorioideae) mit ausschließlich Zungenblüten (Zunge aus allen 5 Kronblättern, deshalb fünfspitzig), randständige Blüten oft vergrößert und steril, die inneren Blüten täuschen im noch nicht voll erblühten Zustand Röhrenblüten vor, Pflanzen beinhalten Milchsaft
- Asternartige (Asteroideae) stets mit Röhrenblüten und oft randlichen Zungenblüten (Zunge nur aus 3 Kronblättern, deshalb dreispitzig)');
INSERT INTO `family_de` VALUES (11,'Raublattgewächse','Boraginaceae','r bis z K5 [C(5) A5] G(2)','radiär, selten zygomorph (Natternkopf), in Wickeln oder Doppelwickeln','5 freie Kelchblätter; 5 miteinander verwachsene Kronblätter, am Eingang
zur Kronröhre oft mit Schlundschuppen, die eine Nebenkrone bilden','5, Filamente mit den Kronblättern verwachsen','1, oberständig, coenocarp aus 2 Fruchtblättern, die beiden Fächer
werden durch eine falsche Scheidewand in 4 Klausen getrennt,
zwischen denen der Griffel steht','5 freie','5 verwachsene','meist 4 einsamige Teilfrüchte (Klausen), oft bestachelt; selten Kapseln','---','wechselständig, ungeteilt, mit starker steifer Behaarung (Versteifung durch Einlagerung von Siliziumdioxid und Kalziumcarbonat)','---','---','Kräuter und Stauden','---','beim Altern der Blüten häufig ein Farbumschlag von Rot nach Blau');
INSERT INTO `family_de` VALUES (12,'Schachtelhalmgewächse','Equisetaceae','---','---','---','---','---','---','---','---','- Sporen bilden sich in Sporenbehältern (Sporangien), die auf Sporangienträgern (Ährentragende Sprosse) erscheinen
- Ähren tragende Sprosse entwickeln sich z.T. jahreszeitlich getrennt von den vegetativen Sprossen und können z.T. deutliche morphologische Unterschiede aufweisen','- zu Schuppen reduziert und zu gezähnten Scheiden verwachsen, stehen quirlständig um die Achsen am oberen Rand eines Stängelabschnitts;
- was auf den ersten Blick als linealische Blätter erscheint, sind Seitenverzweigungen des Hauptsprosses, auch hier sind an den Enden der einzelnen Segmente die Schuppenblätter vorhanden','---','---','Stauden','---','---');
INSERT INTO `family_de` VALUES (13,'Schmetterlingsblüten- oder Hülsenfruchtgewächse','Fabaceae','z K(5) C3+(2) A(10) oder (9)+1 G(1)','zygomorph, meist in Trauben','Blütenhülle: 5 verwachsene Kelchblätter; 5 Kronblätter - das oberste als Fahne (bestehend aus Platte und Nagel), die 2 seitlichen als Flügel bezeichnet, die 2 untersten zum Schiffchen verwachsen','10, an den Filamenten verwachsen, entweder alle 10 zu einer Röhre oder
9 zu einer oben offenen Röhre, die vom 10. Staubblatt abgedeckt wird','1, oberständig, aus 1 Fruchtblatt, steht in der Staubblattröhre','5 verwachsene','5: oberstes=Fahne, 2 seitliche=Flügel, 2 untersten verwachsenen=Schiffchen','Hülsen','---','wechselständig, fast immer gefiedert oder 3-zählig, an Stelle von Fiederblättchen oft Ranken, mit Nebenblättern','---','immer vorhanden','Kräuter, Stauden, in den Tropen oft Gehölze','- Isoflavone mit Östrogen-Wirkung, z.B. Genistein
- bittere Lupinen-Alkaloide wie das Lupinin','viele Arten gehen Symbiose mit Bakterien (Rhizobien) ein, die in Wurzelknöllchen Luftstickstoff binden');
INSERT INTO `family_de` VALUES (14,'Rosengewächse','Rosaceae','r K5 C5 A∞ G1-∞','radiär','5 Kelchblätter, darum oft noch ein Außenkelch aus Hochblättern; 5
Kronblätte','viele, aber immer n x 5, in Kreisen','1 bis viele, ober- bis unterständig, sehr variabel','5 freie','5 (4) freie','nach den Unterfamilien verschieden: Kapseln, Nüsse, Steinfrüchte, Beeren; allgemein sehr
variabel','---','wechselständig, meist mit Nebenblättern (außer Spierstrauchartige), oft tief geteilt, z.T. gefiedert (Rosen)','---','meist vorhanden','Kräuter, Stauden, Gehölze','typisch sind Gerbstoffe, aber auch Triterpene und Cyanogene','- im Unterschied zu Ranunculaceae oft Außenkelch, meist Nebenblätter, Perianth
- 4 Unterfamilien: Spierstrauchartige (Spiraeoideae), Rosenartige (Rosoideae), Apfelartige (Maloideae), Steinobstartige (Prunoidea)');
INSERT INTO `family_de` VALUES (15,'Doldenblütengewächse','Apiaceae','r K5 C5 A5 G(2)','radiär, am Rand von Dolden auch zygomorph, in einfachen oder zusammengesetzten Dolden, die Tragblätter der Doldenstrahlen 1. bzw. 2. Ordnung werden als Hülle bzw. Hüllchen bezeichnet','5 Kelchblätter, oft rückgebildet; 5 Kronblätter (meist weiß oder gelb)','5','1, unterständig, aus 2 Fruchtblättern, zweifächrig, über dem
Fruchtknoten eine Nektar absondernde Scheibe (Discus), aus der die 2
Griffel herausragen','5 freie, oft rückgebildet','5 freie, meist weiß/gelb','- Spaltfrüchte, entstehend durch das Auseinanderweichen der beiden Fruchtblätter an ihrer Verwachsungsfläche
- manchmal mit Schnabel (samenloser, verschmälerter oberer Teil der Frucht)
- Teilfrüchte werden durch einen Fruchtträger zusammengehalten','---','wechselständig, meist gefiedert, oft große Blattscheide','Hülle bzw. Hüllchen: Tragblätter der Dolden bzw. Döldchen','---','Kräuter, meist aber Stauden','- ätherische Öle wie das Carvon des Kümmels
- starke Giftstoffe wie das Coniin des Schierlings','---');
INSERT INTO `family_de` VALUES (16,'Farne','Pteridophytina','---','---','---','---','---','---','---','---','- Sporen bilden sich in blattunterseits angeordneten Sporenbehältern
(Sporangien), die zu kompakten Sporenpaketen (Sori; Einzahl Sorus)
zusammengefasst sind
- Sori sind meist von einem runden oder nierenförmigen Schleier
(Indusium) bedeckt','- werden als Wedel bezeichnet, die meist einfach oder mehrfach gefiedert sind
- entspringen horstig oder einzeln an einer unterirdisch kriechender,
wurzelähnlicher Sprossachse (Rhizom)
- Rhizom als auch der untere Teil des Wedelstiels können von Spreuschuppen bedeckt sein
- Wedel entrollen sich bei Austriebsbeginn als typische Farnschnecken','---','----','Stauden','---','Unterabteilung Pteridophytina mit 2 Farn-Klassen und mehreren Familien');
CREATE TABLE "family" (
	`_id`	NUMERIC,
	`name`	TEXT NOT NULL,
	`scientific_name`	TEXT,
	`flower_formula`	TEXT,
	`flower_type`	TEXT,
	`flower_perianth`	TEXT,
	`flower_stamen`	TEXT,
	`flower_ovary`	TEXT,
	`flower_sepal`	TEXT,
	`flower_petal`	TEXT,
	`fruit`	TEXT,
	`sorus`	TEXT,
	`leaf`	TEXT,
	`involucro`	TEXT,
	`stipule`	TEXT,
	`morphology`	TEXT,
	`ingredients`	TEXT,
	`misc`	TEXT,
	PRIMARY KEY(_id)
);
INSERT INTO `family` VALUES (1,'Amaryllis','Amaryllidaceae',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
CREATE TABLE example_de (_id integer primary key, data text not null, family_id integer, foreign key(family_id) references family_de(_id));
INSERT INTO `example_de` VALUES (1,'Amaryllis/Ritterstern (Hippeastrum) - Südamerika',1);
INSERT INTO `example_de` VALUES (2,'Belladonnalilie (Amaryllis belladonna)',1);
INSERT INTO `example_de` VALUES (3,'Blutblume (Haemanthus) - Südafrika',1);
INSERT INTO `example_de` VALUES (4,'Clivie (Clivia) - Südafrika',1);
INSERT INTO `example_de` VALUES (6,'Märzenbecher (Leucojon)',1);
INSERT INTO `example_de` VALUES (7,'Narzisse (Narcissus)',1);
INSERT INTO `example_de` VALUES (8,'Schneeglöckchen (Galanthus)',1);
INSERT INTO `example_de` VALUES (9,'weltweit 850 Arten in 59 Gattungen, einheimisch 6 Arten in 3 Gattungen',1);
INSERT INTO `example_de` VALUES (10,'weltweit 1.750 Arten in 70 Gattungen, einheimisch 20 Arten in 4 Gattungen',2);
INSERT INTO `example_de` VALUES (11,'Freesie (Freesia) - Südafrika',2);
INSERT INTO `example_de` VALUES (12,'weltweit 650 Arten in 16 Gattungen / einheimisch 6 Gattungen mit 16 Arten',3);
INSERT INTO `example_de` VALUES (13,'weltweit 800 Arten in 23 Gattungen, einheimisch 22 Arten in 1 Gattung',4);
INSERT INTO `example_de` VALUES (14,'Veilchen, Stiefmütterchen (Viola)',4);
INSERT INTO `example_de` VALUES (15,'weltweit 3.710 Arten in 338 Gattungen, einheimisch 150 Arten in 55 Gattungen',5);
INSERT INTO `example_de` VALUES (16,'Ackersenf (Sinapis arvensis)',5);
INSERT INTO `example_de` VALUES (17,'Brunnenkresse (Nasturtium)',5);
INSERT INTO `example_de` VALUES (18,'Goldlack (Cheiranthus)',5);
INSERT INTO `example_de` VALUES (19,'Hederich, Radieschen, Rettich (Raphanus)',5);
INSERT INTO `example_de` VALUES (20,'Hirtentäschel (Capsella)',5);
INSERT INTO `example_de` VALUES (21,'Knoblauchsrauke (Alliaria)',5);
INSERT INTO `example_de` VALUES (22,'Kohl (Brassica)',5);
INSERT INTO `example_de` VALUES (23,'Kohlrübe (Brassica napus)',5);
INSERT INTO `example_de` VALUES (24,'Kresse (Lepidium)',5);
INSERT INTO `example_de` VALUES (25,'Raps (Brassica napus var. napus',5);
INSERT INTO `example_de` VALUES (26,'Gladiole (Gladiolus)',2);
INSERT INTO `example_de` VALUES (27,'Krokus (Crocus)',2);
INSERT INTO `example_de` VALUES (28,'Schwertlilie (Iris)',2);
INSERT INTO `example_de` VALUES (29,'Lilie (Lilium)',3);
INSERT INTO `example_de` VALUES (30,'Tulpe (Tulipa)',3);
INSERT INTO `example_de` VALUES (31,'Schachblume (Fritillaria)',3);
INSERT INTO `example_de` VALUES (32,'Goldstern (Gagea)',3);
INSERT INTO `example_de` VALUES (33,'Faltenlilie (Lloydia)',3);
INSERT INTO `example_de` VALUES (34,'weltweit 2.500 Arten in 55 Gattungen, einheimisch 90 Arten in 20 Gattungen',6);
INSERT INTO `example_de` VALUES (35,'Akelei (Aquilegia)',6);
INSERT INTO `example_de` VALUES (36,'Christophskraut (Actaea)',6);
INSERT INTO `example_de` VALUES (37,'Christrose u. Nieswurz (Helleborus)',6);
INSERT INTO `example_de` VALUES (38,'Eisenhut (Aconitum)',6);
INSERT INTO `example_de` VALUES (39,'Hahnenfuß (Ranunculus)',6);
INSERT INTO `example_de` VALUES (40,'Leberblümchen (Hepatica)',6);
INSERT INTO `example_de` VALUES (41,'Küchenschelle (Pulsatilla)',6);
INSERT INTO `example_de` VALUES (42,'Rittersporn (Consolida, Delphinum)',6);
INSERT INTO `example_de` VALUES (43,'Schwarzkümmel (Nigella)',6);
INSERT INTO `example_de` VALUES (44,'Sumpfdotterblume (Caltha)',6);
INSERT INTO `example_de` VALUES (45,'Trollblume (Trollius)',6);
INSERT INTO `example_de` VALUES (46,'Waldrebe (Clematis)',6);
INSERT INTO `example_de` VALUES (47,'weltweit 2.200 Arten in 86 Gattungen, einheimisch 100 Arten in 30 Gattungen',7);
INSERT INTO `example_de` VALUES (48,'Gips- und Schleierkraut (Gypsophila)',7);
INSERT INTO `example_de` VALUES (49,'Kornrade (Agrostemma)',7);
INSERT INTO `example_de` VALUES (50,'Leinkraut und Lichtnelke (Silene)',7);
INSERT INTO `example_de` VALUES (51,'Pechnelke (Lychnis)',7);
INSERT INTO `example_de` VALUES (52,'Nelke (Dianthus)',7);
INSERT INTO `example_de` VALUES (53,'Seifenkraut (Saponaria)',7);
INSERT INTO `example_de` VALUES (54,'Hornkraut (Cerastium)',7);
INSERT INTO `example_de` VALUES (55,'Sternmiere (Stellaria)',7);
INSERT INTO `example_de` VALUES (56,'weltweit 7.170 Arten in 236 Gattungen, einheimisch 100 Arten in 25 Gattungen',8);
INSERT INTO `example_de` VALUES (57,'Bohnenkraut (Satureja)',8);
INSERT INTO `example_de` VALUES (58,'Dost (Origanum)',8);
INSERT INTO `example_de` VALUES (59,'Gamander (Teucrium)',8);
INSERT INTO `example_de` VALUES (60,'Günsel (Ajuga)',8);
INSERT INTO `example_de` VALUES (61,'Gundermann (Glechoma)',8);
INSERT INTO `example_de` VALUES (62,'Hohlzahn (Galeopsis)',8);
INSERT INTO `example_de` VALUES (63,'Immenblatt (Melittis)',8);
INSERT INTO `example_de` VALUES (64,'Lavendel (Lavandula)',8);
INSERT INTO `example_de` VALUES (65,'Minze (Mentha)',8);
INSERT INTO `example_de` VALUES (66,'Rosmarin (Rosmarinus)',8);
INSERT INTO `example_de` VALUES (67,'Salbei (Salvia)',8);
INSERT INTO `example_de` VALUES (68,'Taubnessel (Lamium)',8);
INSERT INTO `example_de` VALUES (69,'Thymian (Thymus)',8);
INSERT INTO `example_de` VALUES (70,'Ziest (Stachys)',8);
INSERT INTO `example_de` VALUES (71,'weltweit 805 Arten in 7 Gattungen, einheimisch 20 Arten in 2 Gattungen',9);
INSERT INTO `example_de` VALUES (72,'Storchschnabel (Geranium)',9);
INSERT INTO `example_de` VALUES (73,'Reiherschnabel (Erodium)',9);
INSERT INTO `example_de` VALUES (74,'Geranie/Pelargonie (Pelargonium)',9);
INSERT INTO `example_de` VALUES (75,'weltweit 23.000 Arten (+ > 2000 Kleinarten) in 1.600 Gattungen, einheimisch 400 Arten in 80 Gattungen',10);
INSERT INTO `example_de` VALUES (76,'Bocksbart (Tragopogon, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (77,'Gänse- u. Kohldistel (Sonchus, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (78,'Habichtskraut (Hieracium, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (79,'Hasenlattich (Trenanthes, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (80,'Lattich u. Salat (Lactuca, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (81,'Löwenzahn (Leontodon, Taraxacum, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (82,'Milchlattich (Cicerbita, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (83,'Pippau (Crepis, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (84,'Schwarzwurzel (Scorzonera, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (85,'Wegwarte (Cichorium, Cichorioideae)',10);
INSERT INTO `example_de` VALUES (86,'Alpendost (Adenostyles, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (87,'Artischocke (Cynara, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (88,'Beifuß u. Wermut (Artemisia, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (89,'Distel (Carduus, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (90,'Flockenblume u. Kornblume (Amberboa, Centaurea, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (91,'Klette (Arcticum, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (92,'Kratzdistel (Cirsium, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (93,'Pestwurz (Petasites, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (94,'Wasserdost (Eupathorium, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (95,'Edelweiß (Leontopodium, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (96,'Katzenpfötchen (Antennaria, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (97,'Silberdistel (Carlina, Asteroideae mit nur Röhrenblüten)',10);
INSERT INTO `example_de` VALUES (98,'Alant (Inula, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (99,'Arnika (Arnica, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (100,'Aster (Aster, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (101,'Kreuzkraut (Senecio, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (102,'Dahlie (Dahlia, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (103,'Gänseblümchen (Bellis, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (104,'Huflattich (Tussilago, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (105,'Kamille (Matricaria, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (106,'Ringelblume (Calendula, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (107,'Schafgarbe (Achillea, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (108,'Sonnenblume u. Topinambur (Helianthus, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (109,'Sonnenhut (Rudbeckia, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (110,'Zinnie (Zinnia, Asteroideae mit Röhren- und Strahlenblüten)',10);
INSERT INTO `example_de` VALUES (111,'weltweit 3.000 Arten in 165 Gattungen, einheimisch 50 Arten in 15 Gattungen',11);
INSERT INTO `example_de` VALUES (112,'Beinwell (Symphytum)',11);
INSERT INTO `example_de` VALUES (113,'Boretsch (Borago)',11);
INSERT INTO `example_de` VALUES (114,'Hundszunge (Cynoglossum)',11);
INSERT INTO `example_de` VALUES (115,'Lungenkraut (Pulmonaria)',11);
INSERT INTO `example_de` VALUES (116,'Natternkopf (Echium)',11);
INSERT INTO `example_de` VALUES (117,'Ochsenzunge (Anchusa)',11);
INSERT INTO `example_de` VALUES (118,'Vergissmeinnicht (Myosotis)',11);
INSERT INTO `example_de` VALUES (119,'Wachsblume (Cerinthe)',11);
INSERT INTO `example_de` VALUES (120,'nur eine rezente Gattung (Equisetum) mit weltweit 15 Arten, einheimisch 11 Arten',12);
INSERT INTO `example_de` VALUES (121,'weltweit 19325 Arten in 727 Gattungen; einheimisch 38 Gattungen',13);
INSERT INTO `example_de` VALUES (122,'Bohne (Phaseolus)',13);
INSERT INTO `example_de` VALUES (123,'Erbse (Pisum)',13);
INSERT INTO `example_de` VALUES (124,'Erdnuss (Arachis)',13);
INSERT INTO `example_de` VALUES (125,'Ginster (Genista)',13);
INSERT INTO `example_de` VALUES (126,'Klee (Trifolium)',13);
INSERT INTO `example_de` VALUES (127,'Linse (Lens)',13);
INSERT INTO `example_de` VALUES (128,'Lupine (Lupinus)',13);
INSERT INTO `example_de` VALUES (129,'Luzerne u. Schneckenklee (Medicago)',13);
INSERT INTO `example_de` VALUES (130,'Platterbse (Lathyrus)',13);
INSERT INTO `example_de` VALUES (131,'Robinie (Robinia)',13);
INSERT INTO `example_de` VALUES (132,'Wicke (Vicia)',13);
INSERT INTO `example_de` VALUES (133,'Steinklee (Melilotus)',13);
INSERT INTO `example_de` VALUES (134,'weltweit 2.000 Arten in 100 Gattungen, einheimisch 25 Gattungen',14);
INSERT INTO `example_de` VALUES (135,'Geißbart (Aruncus, Spiraeoideae)',14);
INSERT INTO `example_de` VALUES (136,'Spierstaude (Spiraea, Spiraeoideae)',14);
INSERT INTO `example_de` VALUES (137,'Brom- u. Himbeere (Rubus, Rosoideae)',14);
INSERT INTO `example_de` VALUES (138,'Erdbeere (Fragaria, Rosoideae)',14);
INSERT INTO `example_de` VALUES (139,'Fingerkraut (Potentilla, Rosoideae)',14);
INSERT INTO `example_de` VALUES (140,'Frauenmantel (Alchemilla, Rosoideae)',14);
INSERT INTO `example_de` VALUES (141,'Mädesüß (Filipendula, Rosoideae)',14);
INSERT INTO `example_de` VALUES (142,'Rose (Rosa, Rosoideae)',14);
INSERT INTO `example_de` VALUES (143,'Wiesenknopf (Sanguisorba, Rosoideae)',14);
INSERT INTO `example_de` VALUES (144,'Apfel (Malus, Maloideae)',14);
INSERT INTO `example_de` VALUES (145,'Birne (Pyrus, Maloideae)',14);
INSERT INTO `example_de` VALUES (146,'Eberesche (Sorbus, Maloideae)',14);
INSERT INTO `example_de` VALUES (147,'Weißdorn (Crataegus, Maloideae)',14);
INSERT INTO `example_de` VALUES (148,'Aprikose, Kirsche, Mandel, Pfirsich, Pflaume, Schlehe (Prunus, Prunoideae)',14);
INSERT INTO `example_de` VALUES (149,'weltweit 3.780 Arten in 434 Gattungen, einheimisch 100 Arten in 50 Gattungen',15);
INSERT INTO `example_de` VALUES (150,'Bärenklau (Heracleum)',15);
INSERT INTO `example_de` VALUES (151,'Giersch (Aegopodium)',15);
INSERT INTO `example_de` VALUES (152,'Kälberkropf (Chaerophyllum)',15);
INSERT INTO `example_de` VALUES (153,'Kerbel (Anthriscus)',15);
INSERT INTO `example_de` VALUES (154,'Kümmel (Carum)',15);
INSERT INTO `example_de` VALUES (155,'Mannstreu (Eryngium)',15);
INSERT INTO `example_de` VALUES (156,'Möhre (Daucus)',15);
INSERT INTO `example_de` VALUES (157,'Schierling (Conium)',15);
INSERT INTO `example_de` VALUES (158,'Natternzungengewächse (Ophioglossaceae, Psilotopsida)',16);
INSERT INTO `example_de` VALUES (159,'Rautenfarn (Botrychium, Ophioglossaceae, Psilotopsida)',16);
INSERT INTO `example_de` VALUES (160,'Natternzunge (Ophioglossum, Ophioglossaceae, Psilotopsida)',16);
INSERT INTO `example_de` VALUES (161,'Rispenfarngewächse (Osmundaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (162,'Königsfarn (Osmunda, Osmundaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (163,'Streifenfarngewächse (Aspleniaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (164,'Streifenfarn (Asplenium, Aspleniaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (165,'Sumpffarngewächse (Thelypteridaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (166,'Buchenfarn (Phegopteris, Thelypteridaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (167,'Sumpffarn (Thelypteris, Thelypteridaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (168,'Wimpernfarngewächse (Woodsiaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (169,'Wimpernfarn (Woodsia, Woodsiaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (170,'Frauenfarn (Athyrium, Woodsiaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (171,'Wurmfarngewächse (Dryopteridaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (172,'Schildfarn (Polystichum, Dryopteridaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (173,'Wurmfarn (Dryopteris, Dryopteridaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (174,'Adlerfarngewächse (Dennstaedtiaceae, Polypodiopsida)',16);
INSERT INTO `example_de` VALUES (175,'Adlerfarn (Pteridium, Dennstaedtiaceae, Polypodiopsida)',16);
CREATE TABLE example (_id integer primary key, data text not null, family_id integer, foreign key(family_id) references family(_id));
COMMIT;
