sudo docker build --tag tutorial:0.0.1 .

sudo docker images

sudo docker run -d -p 3005:3005 tutorial:0.0.1

sudo docker container ps

gradlew bootJar
```
./gradlew flywayMigrate -i -Pdb_url='jdbc:postgresql://localhost:5432/MSS' -Pdb_user='postgres' -Pdb_password='yasasi'
```
////////
content:[
                {
                    mainTopicId:1,
                    mainTopicName:"පරිමිතිය යනු 1",
                    subTop:[
                        {
                            subTopicId:1_1,
                            subTopicName:"සමචතුරස්රයක පරිමිතිය"
                        },
                        {
                            subTopicId:1_2,
                            subTopicName:"සමචතුරස්රයක පරිමිතිය"
                        }
                    ]
                },
                {
                    mainTopicId:2,
                    mainTopicName:"පරිමිතිය යනු 2",
                    subTop:[]
                },
                {
                    mainTopicId:3,
                    mainTopicName:"පරිමිතිය යනු 3",
                    subTop:[
                        {
                            subTopicId:3_1,
                            subTopicName:"සමචතුරස්රයක පරිමිතිය"
                        },
                        {
                            subTopicId:3_2,
                            subTopicName:"සමචතුරස්රයක පරිමිතිය"
                        }
                    ]
                }
            ]

meka content tika ganna

 Note : [
                {
                    topicId:1,
                    subTopicId:1_1,
                    topic:"පරිමිතිය යනු 1",
                    subTopicName:"සමචතුරස්රයක පරිමිතිය ",
                    ImgForDefUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5parimithiya.png",
                    Definition:"පරිමිතිය යනු යම්කිසි තල රුපයක් වටා මුළු දිග ප්‍රමාණය වේ",
                    Theory:" a theorem attributed to Pythagoras that the square on the hypotenuse of a      right-angled triangle is equal in area to the sum of the squares on the other two sides.",
                    ImgForTheoeyUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png",
                    Example:" Start with:	a2 + b2 = c2 , Put in what we know:	52 + 122 = c2,Calculate squares:	25 + 144 = c2,25+144=169:	169 = c2,Swap sides:	c2 = 169,Square root of both sides:	c = √169,Calculate:	c = 13,",
                    ImgForExampleUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png"
                },
                {
                    topicId:1,
                    subTopicId:1_2,
                    topic:"පරිමිතිය යනු 2",
                    subTopicName:"සමචතුරස්රයක පරිමිතිය ",
                    ImgForDefUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5parimithiya.png",
                    Definition:"පරිමිතිය යනු යම්කිසි තල රුපයක් වටා මුළු දිග ප්‍රමාණය වේ",
                    Theory:" a theorem attributed to Pythagoras that the square on the hypotenuse of a      right-angled triangle is equal in area to the sum of the squares on the other two sides.",
                    ImgForTheoeyUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png",
                    Example:" Start with:	a2 + b2 = c2 , Put in what we know:	52 + 122 = c2,Calculate squares:	25 + 144 = c2,25+144=169:	169 = c2,Swap sides:	c2 = 169,Square root of both sides:	c = √169,Calculate:	c = 13,",
                    ImgForExampleUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png"
                }]

meka subtopic ekak nathan

{
                    topicId:3,
                    subTopicId:0,
                    topic:"පරිමිතිය යනු 3",
                    subTopicName:null,
                    ImgForDefUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5parimithiya.png",
                    Definition:"පරිමිතිය යනු යම්කිසි තල රුපයක් වටා මුළු දිග ප්‍රමාණය වේ",
                    Theory:" a theorem attributed to Pythagoras that the square on the hypotenuse of a      right-angled triangle is equal in area to the sum of the squares on the other two sides.",
                    ImgForTheoeyUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png",
                    Example:" Start with:	a2 + b2 = c2 , Put in what we know:	52 + 122 = c2,Calculate squares:	25 + 144 = c2,25+144=169:	169 = c2,Swap sides:	c2 = 169,Square root of both sides:	c = √169,Calculate:	c = 13,",
                    ImgForExampleUrl:"https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png"
                }
/////// 
