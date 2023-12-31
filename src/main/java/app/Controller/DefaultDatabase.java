package main.java.app.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import main.java.app.Model.Cinema;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Showtime;
import main.java.app.Model.Visa;

public class DefaultDatabase {
    public DefaultDatabase() {
        Database.delete();
        UserController.AddUser("admin", "admin@gmail.com", "123456789");
        UserController.AddUser("admin2", "admin2@gmail.com", "123456789");
        Database.currUser = Database.users.get(0);
        Database.visas.add(new Visa("1111-2222-3333-4444", "1234", 15000000));
        Database.currUser.setVisa(Database.visas.get(0));

        Database.movies.add(new Movie(Database.movies.size(), "Rick And Mortey", "RickandMortey.jpg", "Comedy",
                "Rick is a mentally-unbalanced but scientifically gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                5000));
        Database.movies.add(new Movie(Database.movies.size(), "Harry Potter", "HarryPoter.jpg", "Fantasy",
                "Harry Potter has lived under the stairs at his aunt and uncle's house his whole life. But on his 11th birthday, he learns he's a powerful wizard—with a place waiting for him at the Hogwarts School of Witchcraft and Wizardry. As he learns to harness his newfound powers with the help of the school's kindly headmaster, Harry uncovers the truth about his parents' deaths—and about the villain who's to blame.",
                2000));
        Database.movies.add(new Movie(Database.movies.size(), "The Last Of Us", "TheLastOfUs.jpg", "Drama",
                "Twenty years after modern civilization has been destroyed, Joel, a hardened survivor, is hired to smuggle Ellie, a 14-year-old girl, out of an oppressive quarantine zone. What starts as a small job soon becomes a brutal, heartbreaking journey, as they both must traverse the United States and depend on each other for survival.",
                2000));
        Database.movies.add(new Movie(Database.movies.size(), "Avatar", "Avatar.jpg", "Adventure",
                "In a war-torn world of elemental magic, a young boy reawakens to undertake a dangerous mystic quest to fulfill his destiny as the Avatar, and bring peace to the world.",
                6000));
        Database.movies.add(new Movie(Database.movies.size(), "Spider Man", "SpiderMan.jpg", "Adventure",
                "While being trained by S.H.I.E.L.D., Spider-Man battles evil with a new team of teen colleagues.",
                10000));
        Database.movies.add(new Movie(Database.movies.size(), "Home Alone", "HomeAlone.jpg", "Family",
                "Eight-year-old Kevin McCallister makes the most of the situation after his family unwittingly leaves him behind when they go on Christmas vacation. But when a pair of bungling burglars set their sights on Kevin's house, the plucky kid stands ready to defend his territory. By planting booby traps galore, adorably mischievous Kevin stands his ground as his frantic mother attempts to race home before Christmas Day.",
                600));
        Database.movies.add(new Movie(Database.movies.size(), "The Lord Of The Rings", "TheLordOfTheRings.jpg",
                "Fantasy",
                "Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed.",
                500));
        Database.movies.add(new Movie(Database.movies.size(), "One Piece", "OP.jpg", "Drama",
                "Years ago, the fearsome Pirate King, Gol D. Roger was executed leaving a huge pile of treasure and the famous \"One Piece\" behind. Whoever claims the \"One Piece\" will be named the new King of the Pirates.",
                3333));
        Database.movies.add(new Movie(Database.movies.size(), "Rush Hour", "RushHour.jpg", "Comedy",
                "When Hong Kong Inspector Lee is summoned to Los Angeles to investigate a kidnapping, the FBI doesn't want any outside help and assigns cocky LAPD Detective James Carter to distract Lee from the case. Not content to watch the action from the sidelines, Lee and Carter form an unlikely partnership and investigate the case themselves.",
                9000));
        Database.movies.add(new Movie(Database.movies.size(), "Titanic", "Titanic.jpg", "Drama",
                "101-year-old Rose DeWitt Bukater tells the story of her life aboard the Titanic, 84 years later. A young Rose boards the ship with her mother and fiancé. Meanwhile, Jack Dawson and Fabrizio De Rossi win third-class tickets aboard the ship. Rose tells the whole story from Titanic's departure through to its death—on its first and last voyage—on April 15, 1912.",
                890));
        Database.movies.add(new Movie(Database.movies.size(), "Mission Impossible", "MissionImpossible.jpg",
                "Adventure",
                "Mission: Impossible is an American television series that chronicles the missions of a team of secret American government agents known as the Impossible Missions Force. The show is a revival of the 1966 TV series of the same name. The only actor to return for the series as a regular cast member was Peter Graves who played Jim Phelps, although two other cast members from the original series returned as guest stars. The only other regular cast member to return for every episode was the voice of \"The Tape\", Bob Johnson.",
                7567));
        Database.movies.add(new Movie(Database.movies.size(), "Flash", "Flash.jpg", "Action",
                "When his attempt to save his family inadvertently alters the future, Barry Allen becomes trapped in a reality in which General Zod has returned and there are no Super Heroes to turn to. In order to save the world that he is in and return to the future that he knows, Barry's only hope is to race for his life. But will making the ultimate sacrifice be enough to reset the universe?",
                200));
        Database.movies.add(new Movie(Database.movies.size(), "John Wick", "JohnWick.jpg", "Action",
                "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
                3500));
        Database.movies.add(new Movie(Database.movies.size(), "Black Adam", "BlackAdam.jpg", "Adventure",
                "Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods—and imprisoned just as quickly—Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.",
                20000));
        Database.movies.add(new Movie(Database.movies.size(), "Interstellar", "Interstellar.jpg", "Drama",
                "The adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.",
                50000));
        Database.movies.add(new Movie(Database.movies.size(), "House", "House.jpg", "Family",
                "Dr. Gregory House, a drug-addicted, unconventional, misanthropic medical genius, leads a team of diagnosticians at the fictional Princeton–Plainsboro Teaching Hospital in New Jersey.",
                15000));
        Database.movies.add(new Movie(Database.movies.size(), "The Simpsons", "TheSimpsons.jpg", "Comedy",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                7700));
        Database.movies.add(new Movie(Database.movies.size(), "Friends", "Friends.jpg", "Drama",
                "Six young people from New York City, on their own and struggling to survive in the real world, find the companionship, comfort and support they get from each other to be the perfect antidote to the pressures of life.",
                10555));
        Database.movies.add(new Movie(Database.movies.size(), "WWE", "Wwe.jpg", "Action",
                "The superstars of World Wrestling Entertainment's \"SmackDown\" brand collide each and every Friday on WWE Friday Night SmackDown.",
                55000));
        Database.movies.add(new Movie(Database.movies.size(), "Persona", "Persona.jpg", "Adventure",
                "After being diagnosed with Alzheimer's, a retired judicial officer decides to commit a murder that he had been planning for years.",
                44000));
        Database.movies.add(new Movie(Database.movies.size(), "Doctor Who ", "DoctorWho.jpg", "Drama",
                "The Doctor and friends travel from the dawn of human history to distant alien worlds. And everywhere they go, they find adventure, terror, fun, chases, joy and monsters.",
                11000));
        Database.movies.add(new Movie(Database.movies.size(), "Oppenheimer", "Oppenheimer.jpg", "Action",
                "The story of J. Robert Oppenheimer's role in the development of the atomic bomb during World War II.",
                6990));
        Database.movies.add(new Movie(Database.movies.size(), "Wonka", "Wonka.jpg", "Fantasy",
                "Willy Wonka , chock-full of ideas and determined to change the world one delectable bite at a time – is proof that the best things in life begin with a dream, and if you’re lucky enough to meet Willy Wonka, anything is possible.",
                7900));
        Database.movies.add(new Movie(Database.movies.size(), "Jujutsu Kaisen", "Jujutsu.jpg", "Adventure",
                "Yuji Itadori is a boy with tremendous physical strength, though he lives a completely ordinary high school life. One day, to save a classmate who has been attacked by curses, he eats the finger of Ryomen Sukuna, taking the curse into his own soul. From then on, he shares one body with Ryomen Sukuna. Guided by the most powerful of sorcerers, Satoru Gojo",
                9900));
        Database.movies.add(new Movie(Database.movies.size(), "Parasite", "Parasite.jpg", "Comedy",
                "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
                30000));
        Database.movies.add(new Movie(Database.movies.size(), "Spirited Away", "Spirited Away.jpg", "Drama",
                "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family.",
                6000));
        Database.movies.add(new Movie(Database.movies.size(), "The Godfather", "The Godfather.jpg", "Action",
                "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
                8300));
        Database.movies.add(new Movie(Database.movies.size(), "The Great Dictator", "The Great Dictator.jpg",
                "Comedy",
                "Dictator Adenoid Hynkel tries to expand his empire while a poor Jewish barber tries to avoid persecution from Hynkel's regime.",
                87000));
        Database.movies.add(new Movie(Database.movies.size(), "Grave of the Fireflies",
                "Grave of the Fireflies.jpg",
                "Drama",
                "In the final months of World War II, 14-year-old Seita and his sister Setsuko are orphaned when their mother is killed during an air raid in Kobe, Japan. After a falling out with their aunt, they move into an abandoned bomb shelter. With no surviving relatives and their emergency rations depleted, Seita and Setsuko struggle to survive.",
                3800));
        Database.movies.add(new Movie(Database.movies.size(), "Silenced", "Silenced.jpg", "Drama",
                "Based on actual events that took place at Gwangju Inhwa School for the hearing-impaired, where young deaf students were the victims of repeated sexual assaults by faculty members over a period of five years in the early 2000s.",
                910));
        Database.movies.add(new Movie(Database.movies.size(), "Seven Samurai", "Seven Samurai.jpg", "Drama",
                "A samurai answers a village's request for protection after he falls on hard times. The town needs protection from bandits, so the samurai gathers six others to help him teach the people how to defend themselves, and the villagers provide the soldiers with food.",
                5500));
        Database.movies.add(new Movie(Database.movies.size(), "The Thing", "The Thing.jpg", "Fantasy",
                "A team of American scientists investigate the empty, destroyed base of their Norwegian counterparts in Antarctica, only to discover a terrifying life force that can take the form of its prey.",
                11111));
        Database.movies.add(new Movie(Database.movies.size(), "Joker", "Joker.jpg", "Drama",
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                22000));
        Database.movies.add(new Movie(Database.movies.size(), "Your Name", "Your Name.jpg", "Adventure",
                "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.",
                14000));
        Database.movies.add(new Movie(Database.movies.size(), "LordOfTheRings", "LordOfTheRings.jpg", "Fantasy",
                "Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed.",
                41000));
        Database.visas.add(new Visa("1234-1234-1234-1234", "0000", 50000));
        Database.visas.add(new Visa("1234-1234-1234-1231", "1111", 100000));
        Database.visas.add(new Visa("1234-1234-1234-1232", "1010", 200000));
        Database.visas.add(new Visa("1234-1234-1234-1233", "0101", 30000));
        Database.visas.add(new Visa("1234-1234-1234-1334", "0011", 40000));
        Database.visas.add(new Visa("1234-1234-1234-1333", "2222", 50000));
        Database.visas.add(new Visa("1234-1234-1234-1244", "3333", 60000));
        Database.visas.add(new Visa("1234-1234-1234-1444", "4444", 70000));
        Database.visas.add(new Visa("1234-1234-1234-2234", "1111", 80000));
        Database.visas.add(new Visa("1234-1234-1234-4444", "5555", 90000));
        Database.visas.add(new Visa("1234-1234-1234-3333", "6666", 100000));
        Database.visas.add(new Visa("1234-1234-1234-2222", "7777", 150000));
        Database.visas.add(new Visa("1224-1234-1234-4444", "1100", 90100));
        Database.visas.add(new Visa("1222-1234-1234-3333", "2200", 10300));
        Database.visas.add(new Visa("1232-1234-1234-2222", "0022", 154000));
        Database.visas.add(new Visa("1334-1234-1234-4444", "2020", 90500));
        Database.visas.add(new Visa("1233-1234-1234-3333", "2021", 106700));
        Database.visas.add(new Visa("1234-1234-1234-2222", "2022", 158000));
        Database.visas.add(new Visa("1333-1234-1234-4444", "2023", 90980));
        Database.visas.add(new Visa("1444-1342-1234-3333", "2024", 10650));
        Database.visas.add(new Visa("4234-4324-1234-2222", "2025", 153000));
        Database.visas.add(new Visa("4434-1424-1234-3333", "2026", 100000));
        Database.visas.add(new Visa("4444-1334-1234-2222", "2027", 50000));
        Database.visas.add(new Visa("4424-1134-1234-4444", "2028", 92000));
        Database.visas.add(new Visa("3241-1224-1234-3333", "2029", 100000));
        Database.visas.add(new Visa("3443-1244-1234-2222", "2030", 153000));
        Database.visas.add(new Visa("kljd-2lk3-5dkl-kjdj", "1abc", 50000));
        Database.visas.add(new Visa("qwer-tyui-7890-asdf", "zxcv", 100000));
        Database.visas.add(new Visa("asdf-ghjk-1234-qwer", "5678", 200000));
        Database.visas.add(new Visa("zxcv-0987-lkjh-4321", "qwer", 30000));
        Database.visas.add(new Visa("1234-5678-90qw-erty", "uiop", 40000));
        Database.visas.add(new Visa("lkjh-0987-4poi-5678", "2lk3", 50000));
        Database.visas.add(new Visa("qazx-2wsx-5edc-rfvt", "bgt5", 60000));
        Database.visas.add(new Visa("yhnu-7ujm-89ik-0olp", "mjn8", 70000));
        Database.visas.add(new Visa("asdf-ghjk-tyui-6789", "lkj6", 80000));
        Database.visas.add(new Visa("0okm-9ijn-8uhb-7ygv", "hnbg", 90000));
        Database.visas.add(new Visa("zxcv-bnmm-0987-6543", "vgfr", 100000));
        Database.visas.add(new Visa("qazx-2wsx-5edc-rfvt", "asdc", 150000));
        Database.visas.add(new Visa("lkjh-0987-4poi-5678", "kloi", 90100));
        Database.visas.add(new Visa("qwer-tyui-7890-asdf", "1234", 10300));
        Database.visas.add(new Visa("asdf-ghjk-1234-qwer", "4321", 154000));
        Database.visas.add(new Visa("zxcv-0987-lkjh-4321", "klpo", 90500));
        Database.visas.add(new Visa("1234-5678-90qw-erty", "8901", 106700));
        Database.visas.add(new Visa("lkjh-0987-4poi-5678", "7ygv", 158000));
        Database.visas.add(new Visa("qazx-2wsx-5edc-rfvt", "ytgh", 90980));
        Database.visas.add(new Visa("yhnu-7ujm-89ik-0olp", "poi9", 10650));
        Database.visas.add(new Visa("zxcv-bnmm-0987-6543", "qasx", 153000));
        Database.visas.add(new Visa("lkjh-0987-4poi-5678", "edcr", 100000));
        Database.visas.add(new Visa("0okm-9ijn-8uhb-7ygv", "bnmj", 50000));

        Database.halls.add(new Cinema(Database.halls.size(), "Hall 1",
                new ArrayList<Movie>(Database.movies.subList(0, 5)), 80));
        for (int i = 0; i < 5; i++)
            Database.movies.get(i).setCinema(Database.halls.get(0));
        Database.halls.add(new Cinema(Database.halls.size(), "Hall 2",
                new ArrayList<Movie>(Database.movies.subList(5, 10)), 50));
        for (int i = 5; i < 10; i++)
            Database.movies.get(i).setCinema(Database.halls.get(0));
        Database.halls.add(new Cinema(Database.halls.size(), "Hall 3",
                new ArrayList<Movie>(Database.movies.subList(10, Database.movies.size())), 90));
        for (int i = 10; i < Database.movies.size(); i++)
            Database.movies.get(i).setCinema(Database.halls.get(0));
        ArrayList<Showtime> showtimes = new ArrayList<>();
        showtimes.add(new Showtime(LocalDateTime.of(2024, 1, 15, 10, 0), 0));
        showtimes.add(new Showtime(LocalDateTime.of(2024, 1, 15, 12, 0), 0));
        showtimes.add(new Showtime(LocalDateTime.of(2024, 1, 16, 2, 30), 0));
        Random rand = new Random();
        for (Movie m : Database.movies) {
            showtimes.set(0, new Showtime(showtimes.get(0).date.plusHours(rand.nextInt(12)),
                    m.getCinema().getSeats()));
            showtimes.set(1, new Showtime(showtimes.get(1).date.plusHours(rand.nextInt(12)),
                    m.getCinema().getSeats()));
            showtimes.set(2, new Showtime(showtimes.get(2).date.plusHours(rand.nextInt(12)),
                    m.getCinema().getSeats()));
            m.setShowtimes(new ArrayList<>(showtimes));
        }
        ArrayList<Double> rates = new ArrayList<>();
        rates.add(rand.nextDouble(1, 5));
        rates.add(rand.nextDouble(1, 5));
        rates.add(rand.nextDouble(1, 5));
        for (Movie m : Database.movies) {
            m.setRates(new ArrayList<>(rates));
            rates.set(0, rand.nextDouble(1, 5));
            rates.set(1, rand.nextDouble(1, 5));
            rates.set(2, rand.nextDouble(1, 5));
        }
        Database.save();

    }
}
