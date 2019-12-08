package softsolstudio.apps.selflovecards.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

import softsolstudio.apps.selflovecards.R;

public class  CardDetailFragment extends Fragment {
    View view;
    int id;
    ImageView imageView;
    LinearLayout linearLayout_bg;
    TextView tv_card_info, tv_title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.card_detail_fragment,container,false);
        if (getArguments() != null) {
            id= Integer.parseInt(getArguments().getString("id"));
        } else {
            Toast.makeText(getActivity(), "Basic info not save", Toast.LENGTH_SHORT).show();
        }
        initialization();
        return view;
    }

    private void initialization() {
        imageView=view.findViewById(R.id.carddetail);
        Animation aniFade = AnimationUtils.loadAnimation(getActivity(),R.anim.image_rotation);
        imageView.startAnimation(aniFade);
        linearLayout_bg=view.findViewById(R.id.detail_bg);
        tv_card_info=view.findViewById(R.id.tv_card_info);
        tv_title=view.findViewById(R.id.tv_card_title);
        setImage(id);
    }

    private void setImage(int id) {
       switch (id)
       {
           case 0:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Inspire You");
               tv_card_info.setText("Words are powerful. They can hurt or heal. Most notably, words can inspire. Do you have a favorite quote that inspires you? If nothing comes to mind, scroll through Pinterest or Instagram and you’ll see an abundance of inspirational quotes and sayings. Choose one and post it where you can see it every day.");
               break;
           case 1:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Strengthen You");
               tv_card_info.setText("Having a strong spirit, mind and body connection can greatly enhance your quality of life. Spirit: Start your day with a 3-minute meditation. Simply close your eyes and focus on long deep breathing in and out through your nose. Mind: Expand your mental prowess. Learn a new skill like cooking or engage in intellectually vigorous experiences like visiting museums. Body: Strengthen your core. Start by doing a 15-second plank hold then gradually increase your time.");
               break;
           case 2:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Wow You");
               tv_card_info.setText("It's easy to look at someone else and say: Wow! They are ____________! Fill in the blank beautiful/healthy/brilliant. Yet, how many wows can you identify about yourself? Wow! I am a great cook! Wow! I am loving! Wow! I am blessed! Complete this sentence: Wow! I am _______!");
               break;
           case 3:
               linearLayout_bg.setBackgroundResource(R.drawable.front3);
               tv_title.setText("Smile You");
               tv_card_info.setText("Greet yourself every morning with a big smile! Take an extra moment while getting ready for the day. Stare deep into your own reflection in the mirror. Break out into one of those smiles that makes your eyes sparkle.");
               break;
           case 4:
               linearLayout_bg.setBackgroundResource(R.drawable.front3);
               tv_title.setText("Soften You");
               tv_card_info.setText("Take your fingertips on a tour through your wardrobe. Is there an overabundance of starched, heavy or stiff fabrics? Or do you find more soft, sensuous fabrics? Where is the softness? If you don't think there's enough softness in your life, try adding softer elements into your wardrobe. Add a satin camisole. Switch to super-soft blouses or t-shirts. Wrap up in a fluffy sweater.");
               break;
           case 5:
               linearLayout_bg.setBackgroundResource(R.drawable.front3);
               tv_title.setText("Be You");
               tv_card_info.setText("Be yourself, everyone else is taken\" is a quote attributed to author Oscar Wilde. What fun things make you YOU? How easy it for you to dance/sing/learn/teach about something you enjoy? Wow yourself and be you!");
               break;
           case 6:
               linearLayout_bg.setBackgroundResource(R.drawable.front3);
               tv_title.setText("Rock You");
               tv_card_info.setText("Take this love note anyway that fits you! Need a music fix? ROCK out to your favorite band whether live in concert or listening in your living room. Want to feel the earth move? Grab a toy (or a willing partner) and ROCK your world. Tired of bland food? Experiment with a new recipe and ROCK your taste buds into a new dimension.");
               break;
           case 7:
               linearLayout_bg.setBackgroundResource(R.drawable.front2);
               tv_title.setText("Feed You");
               tv_card_info.setText("If you're like most people, whenever you go on a diet, all the good to you foods must go away and the spotlight turns to foods that are good for you. What if you made a paradigm shift? Instead of focusing on what you can't eat, be inspired by the abundance of new yummy foods that you can add to your eating repertoire. Start small. Take a field trip to your local farmer's market. Make one healthy tweak to an existing recipe. Have fun experimenting with a new vegetable. Explore colors…golden beets anyone?");
               break;
           case 8:
               linearLayout_bg.setBackgroundResource(R.drawable.front2);
               tv_title.setText("Sweeten You");
               tv_card_info.setText("Find the sweet spots in everyday life. Share a smile. Laugh out loud. Enjoy a treat that tickles your taste buds. Get/give a sensational massage. Do a random act of kindness.");
               break;
           case 9:
               linearLayout_bg.setBackgroundResource(R.drawable.front2);
               tv_title.setText("Hydrate You");
               tv_card_info.setText("One of the simplest ways to show yourself some love is to drink more water. Consuming the right amount of water helps your body maintain balance. Have joints been a bit achy? Want clearer skin? Need a boost to lose a few pounds? Instead of sugary, calorie-laden beverages, sip water throughout the day. To enhance the flavor, add a twist of lime or lemon. For an even more refreshing treat, keep a pitcher of water infused with berries or cucumbers or basil in the fridge. Cheers!");
               break;
           case 10:
               linearLayout_bg.setBackgroundResource(R.drawable.front2);
               tv_title.setText("Yoga You");
               tv_card_info.setText("Let's face it…stress is a natural part of your life. How you deal with stress directly impacts your overall health. Yoga is a great way to de-stress. The practice of yoga encourages the alignment of your spirit, body, and mind.  Check out local yoga studios for a class that fits your busy schedule.");
               break;
           case 11:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Calm You:");
               tv_card_info.setText("Take 3 minutes to meditate. Here's an easy way to get started: Find a quiet spot to sit comfortably. Close your eyes. Take a deep breath. Focus on the flow of your breathing. Inhale. Exhale. At the end of 3 minutes, take a deep cleansing breath and gently open your eyes.");
               break;
           case 12:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Dream You");
               tv_card_info.setText("What’s your dream? Learning to fly? Traveling abroad? Whether large or small, our dreams help us craft lives that we love. In the hustle & bustle of adult life, however, we often put dreams on the shelf with hopes of pursuing them one day in the future. The future is now. Take a dream off the shelf. Dust it off and take the first step to make it come true.");
               break;
           case 13:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Happy You");
               tv_card_info.setText("Happiness is…. Take a moment and jot down 3 feelings/images/ideas that describe what happiness is for you. For example, happiness is a baby’s giggle. Then, pick one to focus on. What does it feel like? Keep an eye out for hints of your “happiness is…” throughout your day.");
               break;
           case 14:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Explore You");
               tv_card_info.setText("A key aspect of self-care is actively exploring your inner and outer worlds. Take a moment and examine your routines. Is it time to shake things up a bit? Can’t find time to work out? Opt for the stairs instead of the elevator. No time to meditate? Close your eyes & focus on your breath for 1 minute. Need a vacation? Play the tourist in your own town. Discover and incorporate a new “just right bite” nurturing moment to your day.");
               break;
           case 15:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Learn You");
               tv_card_info.setText("The beauty of life is that you can always learn something new. While some lessons come with grace and ease, others are accompanied by bumps in the road (or on the head). The responses to these direct you on which way to go next. What's interesting is that learning only from the point of view of the head (aka mind/brain/intellect) can be limited.  Use intuition and passion to establish balance. What is your next lesson?");
               break;
           case 16:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Unplug You");
               tv_card_info.setText("Ponder the following: Is your phone among the top 3 things you reach for first thing in the morning? Do you check it every time it beeps, chirps, and buzzes at you? Do you find yourself standing in line at the store staring down at a little screen aimlessly scrolling to pass the time? If you answered yes to these questions, then it might be time to unplug and reconnect with yourself. Try going a day without your phone. If you think that’s too extreme, just start by turning notifications off or limiting your time on social media. You’ll be surprised how much time you will reclaim for yourself.");
               break;
           case 17:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Accept You");
               tv_card_info.setText("How accepting are you of your amazing body? Do this exercise and find out: Get naked and stand in front of a mirror (full length if you have one). What do you see? Are your first thoughts positive or negative? If you have more negative thoughts than positive ones, try expressing gratitude for what you consider to be your best feature and work your way from there. Accept your uniqueness.");
               break;
           case 18:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Forgive You");
               tv_card_info.setText("You may have heard that forgiveness is more for the person who forgives than the person who is being forgiven. So, imagine how doubly blessed would you be if you decided to forgive yourself? Face it…You can be pretty hard on yourself. Life happens and promises are broken, expectations go unmet and mistakes are made. These can pile up and become a layer of unforgiveness. Let go and feel the healing power of these three little words: I forgive me.");
               break;
           case 19:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Visualize You");
               tv_card_info.setText("As a child, using your imagination came naturally. You might have spent hours daydreaming or creating fantastic stories with you as the main character. Who said that had to stop once you were “all grown up”? Set aside a few minutes each day. Visualize your best self/life/opportunities and rewrite the story of your life.");
               break;
           case 20:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Thank You");
               tv_card_info.setText("You've heard the saying: \"Count your blessings.\" Gratitude is a beautiful way to connect with yourself and others. Start by thanking your spirit, mind, and body for being so amazing. Then, move on to saying thank you for the people, experiences and sweet things that make your heart smile. Top off this practice by telling others thank you for what they add to your life.");
               break;
           case 21:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Relax You");
               tv_card_info.setText("Tension. You may not even be aware of how much excess tension you carry in your body. It manifests in your body in various ways. A headache one day. A backache the next. It can even affect your ability to focus. Before you pop a pill for your next ache or twinge, try one of these relaxation options: Stretch. Practice long deep breathing. Strike a restorative yoga pose. Get a massage.");
               break;
           case 22:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Empower You");
               tv_card_info.setText("At your core, what do you believe about yourself? Do you often use phrases like “I can’t” or “I’m not good at…” Excessive negative self-talk can rob you of your power. Take some time to listen and evaluate yourself talk. Replace negatives with words that will empower you to be your best.");
               break;
           case 23:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Motivate You");
               tv_card_info.setText("What gets you excited? If you need an extra boost to get motivated, tap into quotes, speeches, music or memories to jump-start your day. Think on them. Write them. Dance to them. Use them to propel you to the next level of your journey.");
               break;
           case 24:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Quiet You");
               tv_card_info.setText("As the world swirls around you, step out of the whirlwind and find a quiet space. Unplug for a moment. Walk in winter a garden. Or just go sit in your car. Embrace the silence and breathe.");
               break;
           case 25:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Enlighten You");
               tv_card_info.setText("Let’s go deep for a moment. What beliefs do you hold dear? Do you have a guiding philosophy? Enlightenment is not something that exists outside yourself in the teachings of a guru. Become your own guru by exploring the guiding principles of your life. Remove what no longer serves you and replace it with beliefs that can help you soar to higher heights.");
               break;
           case 26:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Reset You");
               tv_card_info.setText("Having trouble sleeping? It might be time to reset your internal clock. In a world of 24 hour everything, many people find it hard to get a good night's rest. Help your body by establishing a bedtime routine. Practice long deep breathing, turn off screens, avoid eating or exercising close to bedtime.");
               break;
           case 27:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Applaud You");
               tv_card_info.setText("When was the last time you cheered yourself on or patted yourself on the back? Try this simple exercise. Step 1: Stand in front of a mirror. Step 2: Start clapping. Step 3: Reflect on recent small wins in your life and keep clapping. Step 4: Repeat as needed.");
               break;
           case 28:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Ask You");
               tv_card_info.setText("Your body is always telling you something. Maybe it’s eliminating a food that while tasty must be followed by antacid. Or is it the lack of exercise that has your joints creaking? Indeed, you can improve your quality of life by tuning in and listening to what your body is bringing to your attention.");
               break;
           case 29:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Reveal You");
               tv_card_info.setText("Major astrological events herald dynamic energetic shifts on the planet. What does that mean for you? Time to examine all aspects of your being--the light and the dark sides of yourself. Choose to reveal the real, authentic you.");
               break;
           case 30:
               linearLayout_bg.setBackgroundResource(R.drawable.front1);
               tv_title.setText("Expand You");
               tv_card_info.setText("Are you feeling constricted by life? It may be time to expand your reality. Make time to visualize your most generous and amazing life. The time is now!");
               break;
           case 31:
               linearLayout_bg.setBackgroundResource(R.drawable.hayyou);
               tv_title.setText("Magic You");
               tv_card_info.setText("Think about something you do that makes the world a little brighter and makes you feel good about being you. It may be the cheery way you say 'hello' to strangers or your amazing homemade snickerdoodles. Whatever it is, share it! You'll not only make your day but someone else's too.");
               break;
           case 32:
               linearLayout_bg.setBackgroundResource(R.drawable.know);
               tv_title.setText("Funny You");
               tv_card_info.setText("Call a friend and LAUGH! We all have at least one. A friend you can call and with whom you share a funny joke or story. Give him/her a call today and LOL for real!");
               break;
           case 33:
               linearLayout_bg.setBackgroundResource(R.drawable.funnt);
               tv_title.setText("Move You");
               tv_card_info.setText("Recent studies have shown that sitting too much can negatively impact our health. Let your smartphone help you out. Download a pedometer app and count your steps. Find & do a 5-minute video workout or DJ your own personal dance party!");
               break;
           case 34:
               linearLayout_bg.setBackgroundResource(R.drawable.acceptyou);
               tv_title.setText("Color You");
               tv_card_info.setText("Color your world. Colors can positively influence our moods and energy. What's your favorite color? How do you feel when you see it? Powerful? Sassy? Calm? If you haven't felt that way in a while, it's time to infuse a splash of color into your life.");
               break;
           case 35:
               linearLayout_bg.setBackgroundResource(R.drawable.loveyou);
               tv_title.setText("Date You");
               tv_card_info.setText("Think play dates are only for kids? Think again. Get in touch with your inner child. Set up play dates for yourself to do things that make your heart smile. Go to the movies. Play tennis with a friend. Grab a crayon or a paintbrush and color your world.");
               break;
           case 36:
               linearLayout_bg.setBackgroundResource(R.drawable.giveyou);
               tv_title.setText("Adventurous You");
               tv_card_info.setText("It’s so easy to say I don't have the time/money/resources/friends to do something. Maybe leaving the country isn't in your budget at the moment but maybe experiencing the cuisine and culture of your dream destination is. Watch travel shows. Look for local festivals, exhibits, organizations, and restaurants that you can visit right in your own backyard. Meet new people, learn cool things and let the adventure unfold one small step at a time.");
               break;
           case 37:
               linearLayout_bg.setBackgroundResource(R.drawable.learnyou);
               tv_title.setText("Celebrate You");
               tv_card_info.setText("Your birthday is the one day a year when it’s totally acceptable to celebrate your amazing self. No one questions if you choose to eat breakfast for breakfast, lunch & dinner because it’s your birthday. Want an in-home massage? Go for it…it’s your birthday. But what if…instead of celebrating you just once a year, you chose to celebrate you once a month or better yet once a week? Pick a day (other than your actual birthdate) to celebrate the wonderfulness that is you. Treat yourself to a fun, easy, wow experience that makes your heart smile.");
               break;
           case 38:
               linearLayout_bg.setBackgroundResource(R.drawable.outside);
               tv_title.setText("Stimulate You");
               tv_card_info.setText("You have 5 senses: hearing, sight, touch, taste, and smell. In the course of the day, these senses are engaged to help you navigate your world. What if you purposely stimulated these senses to enhance your performance throughout the day? Here are a few examples. A whiff of bergamot essential oil can lift spirits. Savor an ice-cold slice of melon to cool you. Run your fingers through a soft patch of grass to ground you. Feast your eyes on something that delights you. Listen to soothing sounds for a peaceful slumber.");
               break;
           case 39:
               linearLayout_bg.setBackgroundResource(R.drawable.jump);
               tv_title.setText("Give You");
               tv_card_info.setText("Interestingly enough, giving to others can be a powerful part of your self-care practice. Studies show that giving your time to help others can lower depression and increase overall wellbeing. Love dogs? Volunteer to walk a busy neighbor's dog. Cooking makes your heart sing? Prepare meals with your local Meals on Wheels program. When done in balance, sharing your caring with others a win-win for everyone.");
               break;
           case 40:
               linearLayout_bg.setBackgroundResource(R.drawable.motivateyou);
               tv_title.setText("Challenge You");
               tv_card_info.setText("Challenges can help you grow. Set a stretch goal and challenge yourself to achieve it. Are you a closet poet and no one knows it? Check out local opportunities to showcase your talent. Have a knack for creating whimsical pottery? Sell your wares online or a local festival. A little challenge may be just what you need to jumpstart a new level of growth in your life.");
               break;
           case 41:
               linearLayout_bg.setBackgroundResource(R.drawable.pamper);
               tv_title.setText("Bliss You");
               tv_card_info.setText("Bliss (noun): Perfect happiness; great joy. A tall order indeed but how often do you even reach for that feeling of bliss? Re-imagine the mantra: \"Follow your bliss.\" Tap into the little things that bring you happiness and joy every day: a delightful piece of chocolate, the warmth of towels just out of the dryer, or cuddling with a puppy.");
               break;
           case 42:
               linearLayout_bg.setBackgroundResource(R.drawable.magic);
               tv_title.setText("Soften You");
               tv_card_info.setText("Take your fingertips on a tour through your wardrobe. Is there an overabundance of starched, heavy or stiff fabrics? Or do you find more soft, sensuous fabrics? Where is the softness? If you don't think there's enough softness in your life, try adding softer elements into your wardrobe. Add a satin camisole. Switch to super-soft blouses or t-shirts. Wrap up in a fluffy sweater.");
               break;
           case 43:
               linearLayout_bg.setBackgroundResource(R.drawable.quietyou);
               tv_title.setText("Befriend You");
               tv_card_info.setText("Healthy friendships add to your quality of life. Who's your BFF? Now, pause for a moment. Do you treat yourself as well as you do your best friends? Be your own bestie first. Play. Laugh. Live.");
               break;
           case 44:
               linearLayout_bg.setBackgroundResource(R.drawable.rrest);
               tv_title.setText("Captivate You");
               tv_card_info.setText("When was the last time you felt and looked your best? If it's been so long that you can't remember, then now is the time to be the most captivating person you know. Work from the inside out. Nurture your soul. Visualize your fabulousness. Nourish your body. Then, dress the part. Don your favorite outfit and strut your stuff in the world.");
               break;
           case 45:
               linearLayout_bg.setBackgroundResource(R.drawable.move);
               tv_title.setText("Tickle You");
               tv_card_info.setText("What tickles your funny bone? If you can't remember where your funny bone is, then it's time to rediscover laughter. Step 1: Find a laughter source i.e. fave sitcom, funny stories or thoughts. Step 2: Giggle, chuckle or guffaw until you are out of breath. Step 3: Repeat step 1 as many times as needed.");
               break;
           case 46:
               linearLayout_bg.setBackgroundResource(R.drawable.relax);
               tv_title.setText("Express You");
               tv_card_info.setText("It's time. Give yourself permission to express your creativity. Write that play. Take a sculpting class. Whip up a gourmet meal. The result is that you sing your song! You can choose to share it or not. That's up to you. Just do it.");
               break;
           case 47:
               linearLayout_bg.setBackgroundResource(R.drawable.shock);
               tv_title.setText("Release You");
               tv_card_info.setText("Life is precious. Release yourself from others' expectations and any old patterns and beliefs about who you should be. Focus on the pleasures and joys that fuel your life.");
               break;
           case 48:
               linearLayout_bg.setBackgroundResource(R.drawable.release);
               tv_title.setText("Jump You");
               tv_card_info.setText("Go ahead.... jump. Jump up and down wherever you stand. For a moment, release your \"good home training\" and jump on your bed. Or find a trampoline and enjoy the flight.\"");
               break;
           case 49:
               linearLayout_bg.setBackgroundResource(R.drawable.reset);
               tv_title.setText("Cheer You");
               tv_card_info.setText("Sometimes you have to be your own cheerleader. Make up a cheer just for you. Stand in the mirror and chant out loud. Here's one for starters: 2-4-6-8 who do I appreciate? Me! Me! Me!");
               break;
           case 50:
               linearLayout_bg.setBackgroundResource(R.drawable.sing);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 51:
               linearLayout_bg.setBackgroundResource(R.drawable.caress);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 52:
               linearLayout_bg.setBackgroundResource(R.drawable.reveal);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 53:
               linearLayout_bg.setBackgroundResource(R.drawable.sweat);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 54:
               linearLayout_bg.setBackgroundResource(R.drawable.befriend);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 55:
               linearLayout_bg.setBackgroundResource(R.drawable.thankyou);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 56:
               linearLayout_bg.setBackgroundResource(R.drawable.balance);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 57:
               linearLayout_bg.setBackgroundResource(R.drawable.ask);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 58:
               linearLayout_bg.setBackgroundResource(R.drawable.unplug);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 59:
               linearLayout_bg.setBackgroundResource(R.drawable.treat);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 60:
               linearLayout_bg.setBackgroundResource(R.drawable.stimulate);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 61:
               linearLayout_bg.setBackgroundResource(R.drawable.visualize);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 62:
               linearLayout_bg.setBackgroundResource(R.drawable.yes);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 63:
               linearLayout_bg.setBackgroundResource(R.drawable.tickle);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 64:
               linearLayout_bg.setBackgroundResource(R.drawable.adventure);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
           case 65:
               linearLayout_bg.setBackgroundResource (R.drawable.calmyou);
               tv_title.setText("");
               tv_card_info.setText("");
               break;
       }
    }
}
