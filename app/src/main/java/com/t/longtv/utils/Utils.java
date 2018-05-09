package com.t.longtv.utils;

/**
 * 作者：龙昊
 * 日期：2018/4/16 12:11
 * 描述：
 */

public class Utils{
/*    public String c(Context paramContext, Map<String, String> paramMap)
    {
        this.c = (System.currentTimeMillis() / 60000L + "");
        paramContext = paramMap;
        if (paramMap == null) {
            paramContext = new TreeMap();
        }
        if (paramContext.containsKey("token")) {
            paramContext.remove("token");
        }
        paramContext.put("refer", "android");
        paramContext.put("time", this.c);
        paramContext.put("ver", this.d);
        paramContext.put("an", this.e);
        return aa.j(aa.a(paramContext) + "EU*T*)*(#23ssdfd");
    }*/
    /*
    public static String a(Map<String, String> paramMap)
    {
        TreeMap localTreeMap = new TreeMap(new Comparator()
        {
            public int a(String paramAnonymousString1, String paramAnonymousString2)
            {
                return paramAnonymousString2.compareTo(paramAnonymousString1);
            }
        });
        localTreeMap.putAll(paramMap);
        Iterator localIterator = localTreeMap.keySet().iterator();
        String str1 = "";
        String str2;
        for (paramMap = ""; localIterator.hasNext(); paramMap = paramMap + str2)
        {
            str2 = (String)localIterator.next();
            str1 = str1 + str2;
            str2 = (String)localTreeMap.get(str2);
        }
        return paramMap;*/
    }


/*        public static final Pattern a = Pattern.compile("\\[f:\\d{1,3}\\]");
        private static final String b = "MD5";
        private static final char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

        public static void A(String paramString)
        {
            a(new File(paramString));
        }

        public static <T> List<T> B(String paramString)
        {
            Object localObject = new ArrayList();
            if (paramString == null) {
                return (List<T>)localObject;
            }
            localObject = new Gson();
            Type localType = new TypeToken() {}.getType();
            if (!(localObject instanceof Gson)) {}
            for (paramString = ((Gson)localObject).fromJson(paramString, localType);; paramString = NBSGsonInstrumentation.fromJson((Gson)localObject, paramString, localType)) {
                return (List)paramString;
            }
        }

        public static byte[] C(String paramString)
        {
            if ((paramString == null) || (paramString.trim().length() == 0)) {
                return null;
            }
            int j = paramString.length() / 2;
            paramString = paramString.toCharArray();
            byte[] arrayOfByte = new byte[j];
            int i = 0;
            for (;;)
            {
                if (i >= j) {
                    break label97;
                }
                int m = i * 2;
                int k = "0123456789abcdef".indexOf(paramString[m]) << 4;
                m = "0123456789abcdef".indexOf(paramString[(m + 1)]);
                if ((k == -1) || (m == -1)) {
                    break;
                }
                arrayOfByte[i] = ((byte)(m | k));
                i += 1;
            }
            label97:
            return arrayOfByte;
        }

        public static long D(String paramString)
        {
            long l1 = 0L;
            long l2 = l1;
            if (!"".equals(paramString))
            {
                paramString = paramString.split(":");
                l2 = l1;
                if (paramString != null)
                {
                    int i = 0;
                    for (;;)
                    {
                        l2 = l1;
                        if (i >= paramString.length) {
                            break;
                        }
                        l1 = (l1 + Integer.parseInt(paramString[i]) * Math.pow(60.0D, paramString.length - i - 1));
                        i += 1;
                    }
                }
            }
            return l2;
        }

        public static double a(float paramFloat)
        {
            return Math.round(paramFloat / 100.0F) / 100.0D;
        }

        public static int a(Context paramContext, float paramFloat)
        {
            return (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
        }

        public static int a(View paramView)
        {
            int i = View.MeasureSpec.makeMeasureSpec(0, 0);
            paramView.measure(i, i);
            return paramView.getMeasuredWidth();
        }

        public static Bitmap a(Context paramContext, String paramString, int paramInt1, int paramInt2)
        {
            Bitmap localBitmap = Bitmap.createBitmap(a(paramContext, paramInt2 / 2) + paramInt1, a(paramContext, paramInt2), Bitmap.Config.ARGB_8888);
            Canvas localCanvas = new Canvas(localBitmap);
            Paint localPaint = new Paint();
            localPaint.setColor(Color.parseColor(paramString));
            paramString = new Path();
            paramString.moveTo(0.0F, a(paramContext, paramInt2));
            paramString.lineTo(paramInt1, a(paramContext, paramInt2));
            paramString.lineTo(a(paramContext, 6.0F) + paramInt1, 0.0F);
            paramString.lineTo(0.0F, 0.0F);
            paramString.close();
            localCanvas.drawPath(paramString, localPaint);
            return localBitmap;
        }

        public static Bitmap a(Bitmap paramBitmap)
        {
            int i = paramBitmap.getWidth();
            int j = paramBitmap.getHeight();
            float f1 = 50 / i;
            float f2 = 50 / j;
            Matrix localMatrix = new Matrix();
            localMatrix.postScale(f1, f2);
            return Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
        }

        public static Bitmap a(Bitmap paramBitmap, float paramFloat)
        {
            Matrix localMatrix = new Matrix();
            localMatrix.postScale(paramFloat, paramFloat);
            return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
        }

        public static Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2)
        {
            Bitmap localBitmap = Bitmap.createBitmap(paramBitmap1.getWidth() + paramBitmap2.getWidth(), Math.max(paramBitmap1.getHeight(), paramBitmap2.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas localCanvas = new Canvas(localBitmap);
            localCanvas.drawBitmap(paramBitmap1, 0.0F, 0.0F, null);
            localCanvas.drawBitmap(paramBitmap2, paramBitmap1.getWidth() + 10, 0.0F, null);
            return localBitmap;
        }

        public static Bitmap a(Drawable paramDrawable)
        {
            int i = paramDrawable.getIntrinsicWidth();
            int j = paramDrawable.getIntrinsicHeight();
            if (paramDrawable.getOpacity() != -1) {}
            for (Object localObject = Bitmap.Config.ARGB_8888;; localObject = Bitmap.Config.RGB_565)
            {
                localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
                Canvas localCanvas = new Canvas((Bitmap)localObject);
                paramDrawable.setBounds(0, 0, i, j);
                paramDrawable.draw(localCanvas);
                return (Bitmap)localObject;
            }
        }

        public static Bitmap a(ArrayList<Bitmap> paramArrayList, int paramInt1, int paramInt2)
        {
            if ((paramArrayList != null) && (paramArrayList.size() >= 2))
            {
                Bitmap localBitmap1 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
                Canvas localCanvas = new Canvas(localBitmap1);
                paramInt2 = 0;
                paramInt1 = 0;
                if (paramInt2 < paramArrayList.size())
                {
                    Bitmap localBitmap2 = (Bitmap)paramArrayList.get(paramInt2);
                    float f2 = paramInt1;
                    if (paramInt2 == 0) {}
                    for (float f1 = (((Bitmap)paramArrayList.get(1)).getHeight() - ((Bitmap)paramArrayList.get(0)).getHeight()) / 2;; f1 = 0.0F)
                    {
                        localCanvas.drawBitmap(localBitmap2, f2, f1, null);
                        int i = ((Bitmap)paramArrayList.get(paramInt2)).getWidth();
                        paramInt2 += 1;
                        paramInt1 += i;
                        break;
                    }
                }
                return localBitmap1;
            }
            return null;
        }

        public static SpannableStringBuilder a(ChatMessageBean.Speak paramSpeak, Context paramContext)
        {
            Object localObject1 = paramSpeak.getUser().getName() + " : ";
            String str = paramSpeak.getBarrage().getMsg();
            localObject1 = new SpannableStringBuilder((CharSequence)localObject1);
            Object localObject2 = new ForegroundColorSpan(paramContext.getResources().getColor(2131624207));
            Object localObject3 = new ForegroundColorSpan(paramContext.getResources().getColor(2131624207));
            int i;
            if (paramSpeak.getUser().getUid().equals(y.e(paramContext, "uid")))
            {
                ((SpannableStringBuilder)localObject1).setSpan(localObject3, 0, paramSpeak.getUser().getName().length() + 3, 33);
                if ((str.indexOf("[") <= -1) || (str.indexOf("]") <= -1)) {
                    break label445;
                }
                paramSpeak = str.replace("[", "-[").replace("]", "]-").split("-");
                int j = paramSpeak.length;
                i = 0;
                label186:
                if (i >= j) {
                    break label453;
                }
                str = paramSpeak[i];
                if ((!str.startsWith("[")) || (!str.endsWith("]"))) {
                    break label434;
                }
                if (l.f().d().get(str) == null) {
                    break label423;
                }
                localObject2 = NBSBitmapFactoryInstrumentation.decodeResource(paramContext.getResources(), ((Integer)l.f().d().get(str)).intValue());
                int k = ((Bitmap)localObject2).getHeight();
                int m = ((Bitmap)localObject2).getHeight();
                int n = a(paramContext, 15.0F);
                float f1 = n / k;
                float f2 = n / m;
                localObject3 = new Matrix();
                ((Matrix)localObject3).postScale(f1, f2);
                localObject2 = new a(paramContext, Bitmap.createBitmap((Bitmap)localObject2, 0, 0, m, k, (Matrix)localObject3, true));
                localObject3 = new SpannableString(str);
                ((SpannableString)localObject3).setSpan(localObject2, str.indexOf('['), str.indexOf(']') + 1, 33);
                ((SpannableStringBuilder)localObject1).append((CharSequence)localObject3);
            }
            for (;;)
            {
                i += 1;
                break label186;
                ((SpannableStringBuilder)localObject1).setSpan(localObject2, 0, paramSpeak.getUser().getName().length() + 3, 33);
                break;
                label423:
                ((SpannableStringBuilder)localObject1).append(str);
                continue;
                label434:
                ((SpannableStringBuilder)localObject1).append(str);
            }
            label445:
            ((SpannableStringBuilder)localObject1).append(str);
            label453:
            return (SpannableStringBuilder)localObject1;
        }

        public static LayoutInflater a(Context paramContext)
        {
            return (LayoutInflater)paramContext.getSystemService("layout_inflater");
        }

        public static String a()
        {
            Date localDate = new Date();
            return new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(localDate);
        }

        public static String a(int paramInt)
        {
            int j = 0;
            int k = paramInt % 3600;
            int i;
            if (paramInt > 3600)
            {
                paramInt /= 3600;
                if (k == 0) {
                    break label148;
                }
                if (k > 60)
                {
                    i = k / 60;
                    if (k % 60 == 0) {
                        break label139;
                    }
                    k %= 60;
                    j = i;
                    i = paramInt;
                    paramInt = j;
                    j = k;
                }
            }
            for (;;)
            {
                return i + "��" + paramInt + "��" + j + "��";
                i = paramInt;
                j = k;
                paramInt = 0;
                continue;
                i = paramInt / 60;
                if (paramInt % 60 != 0)
                {
                    k = 0;
                    j = paramInt % 60;
                    paramInt = i;
                    i = k;
                }
                else
                {
                    paramInt = i;
                    i = 0;
                    continue;
                    label139:
                    k = paramInt;
                    paramInt = i;
                    i = k;
                    continue;
                    label148:
                    k = 0;
                    i = paramInt;
                    paramInt = k;
                }
            }
        }

        public static String a(long paramLong)
        {
            return new SimpleDateFormat("yyyy��MM��dd").format(new Date(Long.parseLong(String.valueOf(1000L * paramLong))));
        }

        public static String a(String paramString1, String paramString2, String paramString3)
        {
            return paramString1.replaceAll(paramString2, paramString3);
        }

        public static String a(List paramList)
        {
            StringBuilder localStringBuilder = new StringBuilder();
            int i = 0;
            if (i < paramList.size())
            {
                if (i == paramList.size() - 1) {
                    localStringBuilder.append(paramList.get(i));
                }
                for (;;)
                {
                    i += 1;
                    break;
                    localStringBuilder.append(paramList.get(i) + ",");
                }
            }
            return localStringBuilder.toString();
        }

        public static String a(Map<String, String> paramMap)
        {
            TreeMap localTreeMap = new TreeMap(new Comparator()
            {
                public int a(String paramAnonymousString1, String paramAnonymousString2)
                {
                    return paramAnonymousString2.compareTo(paramAnonymousString1);
                }
            });
            localTreeMap.putAll(paramMap);
            Iterator localIterator = localTreeMap.keySet().iterator();
            String str1 = "";
            String str2;
            for (paramMap = ""; localIterator.hasNext(); paramMap = paramMap + str2)
            {
                str2 = (String)localIterator.next();
                str1 = str1 + str2;
                str2 = (String)localTreeMap.get(str2);
            }
            return paramMap;
        }

        private static String a(byte[] paramArrayOfByte)
        {
            int j = paramArrayOfByte.length;
            StringBuilder localStringBuilder = new StringBuilder(j * 2);
            int i = 0;
            while (i < j)
            {
                localStringBuilder.append(c[(paramArrayOfByte[i] >> 4 & 0xF)]);
                localStringBuilder.append(c[(paramArrayOfByte[i] & 0xF)]);
                i += 1;
            }
            return localStringBuilder.toString();
        }

        public static String a(boolean[] paramArrayOfBoolean)
        {
            return s(u(b(paramArrayOfBoolean)));
        }

        public static List a(List paramList, int paramInt)
        {
            ArrayList localArrayList1 = new ArrayList();
            ArrayList localArrayList2 = new ArrayList();
            try
            {
                localArrayList2.addAll(paramList);
                localArrayList2.remove(paramInt);
                localArrayList1.addAll(localArrayList2);
                return localArrayList1;
            }
            catch (Exception paramList) {}
            return localArrayList1;
        }

        public static List a(List paramList, String paramString)
        {
            ArrayList localArrayList1 = new ArrayList();
            ArrayList localArrayList2 = new ArrayList();
            localArrayList2.addAll(paramList);
            try
            {
                if (localArrayList2.size() == 20) {
                    localArrayList2.remove(19);
                }
                localArrayList1.add(paramString);
                if (!b(paramList, paramString)) {
                    return paramList;
                }
                localArrayList1.addAll(localArrayList2);
                return localArrayList1;
            }
            catch (Exception localException)
            {
                for (;;) {}
            }
        }

        public static void a(int paramInt, RelativeLayout paramRelativeLayout)
        {
            FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
            localLayoutParams.setMargins(0, paramInt, 0, 0);
            paramRelativeLayout.setLayoutParams(localLayoutParams);
        }

        public static void a(Activity paramActivity)
        {
            InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
            if (localInputMethodManager != null) {
                localInputMethodManager.hideSoftInputFromWindow(paramActivity.getWindow().getDecorView().getWindowToken(), 0);
            }
        }

        public static void a(Activity paramActivity, int paramInt)
        {
            Toast.makeText(paramActivity, paramActivity.getString(paramInt), 1).show();
        }

        public static void a(Activity paramActivity, Class paramClass, int paramInt)
        {
            Intent localIntent = new Intent();
            localIntent.setClass(paramActivity, paramClass);
            paramActivity.startActivityForResult(localIntent, paramInt);
        }

        public static void a(Activity paramActivity, Class paramClass, Bundle paramBundle, int paramInt)
        {
            Intent localIntent = new Intent();
            localIntent.setClass(paramActivity, paramClass);
            if (paramBundle != null) {
                localIntent.putExtras(paramBundle);
            }
            paramActivity.startActivityForResult(localIntent, paramInt);
        }

        public static void a(Activity paramActivity, String paramString)
        {
            Toast.makeText(paramActivity, paramString, 0).show();
        }

        public static void a(Context paramContext, Class paramClass)
        {
            Intent localIntent = new Intent();
            localIntent.setClass(paramContext, paramClass);
            paramContext.startActivity(localIntent);
        }

        public static void a(Context paramContext, Class paramClass, Bundle paramBundle)
        {
            Intent localIntent = new Intent();
            localIntent.addFlags(536870912);
            localIntent.setFlags(67108864);
            localIntent.setClass(paramContext, paramClass);
            if (paramBundle != null) {
                localIntent.putExtras(paramBundle);
            }
            paramContext.startActivity(localIntent);
        }

        public static void a(Context paramContext, String paramString)
        {
            Toast.makeText(paramContext, paramString, 0).show();
        }

        public static void a(Context paramContext, String paramString, int paramInt, ImageView paramImageView)
        {
            com.bumptech.glide.l.c(paramContext).a(paramString).a(DiskCacheStrategy.ALL).a(new com.bumptech.glide.g.f()
            {
                public boolean a(b paramAnonymousb, String paramAnonymousString, m<b> paramAnonymousm, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
                {
                    if (this.a == null) {
                        return false;
                    }
                    if (this.a.getScaleType() != ImageView.ScaleType.FIT_XY) {
                        this.a.setScaleType(ImageView.ScaleType.FIT_XY);
                    }
                    paramAnonymousString = this.a.getLayoutParams();
                    paramAnonymousString.height = (Math.round((this.a.getWidth() - this.a.getPaddingLeft() - this.a.getPaddingRight()) / paramAnonymousb.getIntrinsicWidth() * paramAnonymousb.getIntrinsicHeight()) + this.a.getPaddingTop() + this.a.getPaddingBottom());
                    this.a.setLayoutParams(paramAnonymousString);
                    return false;
                }

                public boolean a(Exception paramAnonymousException, String paramAnonymousString, m<b> paramAnonymousm, boolean paramAnonymousBoolean)
                {
                    return false;
                }
            }).d(paramInt).j(paramInt).a(paramImageView);
        }

        *//* Error *//*
        public static void a(android.widget.GridView paramGridView)
        {
            // Byte code:
            //   0: aload_0
            //   1: invokevirtual 672	android/widget/GridView:getAdapter	()Landroid/widget/ListAdapter;
            //   4: astore 6
            //   6: aload 6
            //   8: ifnonnull +4 -> 12
            //   11: return
            //   12: aload_0
            //   13: invokevirtual 676	java/lang/Object:getClass	()Ljava/lang/Class;
            //   16: astore 5
            //   18: aload 5
            //   20: ldc_w 678
            //   23: invokevirtual 684	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //   26: astore 7
            //   28: aload 7
            //   30: iconst_1
            //   31: invokevirtual 690	java/lang/reflect/Field:setAccessible	(Z)V
            //   34: aload 7
            //   36: aload_0
            //   37: invokevirtual 691	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
            //   40: checkcast 130	java/lang/Integer
            //   43: invokevirtual 396	java/lang/Integer:intValue	()I
            //   46: istore_1
            //   47: aload 5
            //   49: ldc_w 693
            //   52: invokevirtual 684	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //   55: astore 5
            //   57: aload 5
            //   59: iconst_1
            //   60: invokevirtual 690	java/lang/reflect/Field:setAccessible	(Z)V
            //   63: aload 5
            //   65: aload_0
            //   66: invokevirtual 691	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
            //   69: checkcast 130	java/lang/Integer
            //   72: invokevirtual 396	java/lang/Integer:intValue	()I
            //   75: istore_2
            //   76: iload_1
            //   77: istore_3
            //   78: iload_2
            //   79: istore_1
            //   80: aload 6
            //   82: invokeinterface 698 1 0
            //   87: iload_3
            //   88: irem
            //   89: ifle +77 -> 166
            //   92: aload 6
            //   94: invokeinterface 698 1 0
            //   99: iload_3
            //   100: idiv
            //   101: iconst_1
            //   102: iadd
            //   103: istore_2
            //   104: iconst_0
            //   105: istore_3
            //   106: iconst_0
            //   107: istore 4
            //   109: iload_3
            //   110: iload_2
            //   111: if_icmpge +68 -> 179
            //   114: aload 6
            //   116: iload_3
            //   117: aconst_null
            //   118: aload_0
            //   119: invokeinterface 702 4 0
            //   124: astore 5
            //   126: aload 5
            //   128: iconst_0
            //   129: iconst_0
            //   130: invokevirtual 183	android/view/View:measure	(II)V
            //   133: iload 4
            //   135: aload 5
            //   137: invokevirtual 705	android/view/View:getMeasuredHeight	()I
            //   140: iadd
            //   141: istore 4
            //   143: iload_3
            //   144: iconst_1
            //   145: iadd
            //   146: istore_3
            //   147: goto -38 -> 109
            //   150: astore 5
            //   152: iconst_0
            //   153: istore_1
            //   154: aload 5
            //   156: invokevirtual 708	java/lang/Exception:printStackTrace	()V
            //   159: iload_1
            //   160: istore_3
            //   161: iconst_0
            //   162: istore_1
            //   163: goto -83 -> 80
            //   166: aload 6
            //   168: invokeinterface 698 1 0
            //   173: iload_3
            //   174: idiv
            //   175: istore_2
            //   176: goto -72 -> 104
            //   179: aload_0
            //   180: invokevirtual 712	android/widget/GridView:getLayoutParams	()Landroid/view/ViewGroup$LayoutParams;
            //   183: astore 5
            //   185: aload 5
            //   187: iload_1
            //   188: iload_2
            //   189: iconst_1
            //   190: isub
            //   191: imul
            //   192: iload 4
            //   194: iadd
            //   195: putfield 718	android/view/ViewGroup$LayoutParams:height	I
            //   198: aload_0
            //   199: aload 5
            //   201: invokevirtual 719	android/widget/GridView:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
            //   204: return
            //   205: astore 5
            //   207: goto -53 -> 154
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	210	0	paramGridView	android.widget.GridView
            //   46	146	1	i	int
            //   75	116	2	j	int
            //   77	98	3	k	int
            //   107	88	4	m	int
            //   16	120	5	localObject	Object
            //   150	5	5	localException1	Exception
            //   183	17	5	localLayoutParams	ViewGroup.LayoutParams
            //   205	1	5	localException2	Exception
            //   4	163	6	localListAdapter	ListAdapter
            //   26	9	7	localField	Field
            // Exception table:
            //   from	to	target	type
            //   18	47	150	java/lang/Exception
            //   47	76	205	java/lang/Exception
        }

        public static void a(ListView paramListView)
        {
            ListAdapter localListAdapter = paramListView.getAdapter();
            if (localListAdapter == null) {
                return;
            }
            int k = localListAdapter.getCount();
            int i = 0;
            int j = 0;
            while (i < k)
            {
                localObject = localListAdapter.getView(i, null, paramListView);
                ((View)localObject).measure(0, 0);
                j += ((View)localObject).getMeasuredHeight();
                i += 1;
            }
            Object localObject = paramListView.getLayoutParams();
            ((ViewGroup.LayoutParams)localObject).height = (paramListView.getDividerHeight() * (localListAdapter.getCount() - 1) + j);
            paramListView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }

        public static void a(File paramFile)
        {
            try
            {
                if (paramFile.isDirectory())
                {
                    paramFile = paramFile.listFiles();
                    int j = paramFile.length;
                    int i = 0;
                    while (i < j)
                    {
                        File localFile = paramFile[i];
                        a(localFile);
                        localFile.delete();
                        i += 1;
                    }
                }
                paramFile.delete();
                return;
            }
            catch (Exception paramFile) {}
        }

        public static boolean a(Context paramContext, String paramString1, String paramString2)
        {
            if (TextUtils.isEmpty(paramString1))
            {
                a(paramContext, "����������������");
                return false;
            }
            if (("����".equals(paramString2)) || ("86".equals(paramString2)) || ("+86".equals(paramString2)))
            {
                if (!a(paramString1))
                {
                    a(paramContext, "����������������������");
                    return false;
                }
            }
            else if (("����".equals(paramString2)) || ("852".equals(paramString2)))
            {
                if (!b(paramString1))
                {
                    a(paramContext, "����������������������");
                    return false;
                }
            }
            else if (("����".equals(paramString2)) || ("853".equals(paramString2)))
            {
                if (!c(paramString1))
                {
                    a(paramContext, "����������������������");
                    return false;
                }
            }
            else if ((("����".equals(paramString2)) || ("886".equals(paramString2))) && (!d(paramString1)))
            {
                a(paramContext, "����������������������");
                return false;
            }
            return true;
        }

        public static boolean a(SslCertificate paramSslCertificate, String paramString)
        {
            paramString = C(paramString);
            paramSslCertificate = SslCertificate.saveState(paramSslCertificate);
            if (paramSslCertificate != null)
            {
                paramSslCertificate = paramSslCertificate.getByteArray("x509-certificate");
                if (paramSslCertificate != null) {
                    try
                    {
                        paramSslCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(paramSslCertificate));
                        boolean bool = Arrays.equals(MessageDigest.getInstance("SHA-256").digest(((X509Certificate)paramSslCertificate).getEncoded()), paramString);
                        return bool;
                    }
                    catch (Exception paramSslCertificate)
                    {
                        paramSslCertificate.printStackTrace();
                    }
                }
            }
            return false;
        }

        public static boolean a(String paramString)
        {
            return Pattern.compile("^((13[0-9])|(14[0-9])|(15[^4,\\D])|(18[0-9])|(17[0-9]))\\d{8}$").matcher(paramString).matches();
        }

        public static boolean a(String paramString1, String paramString2, Context paramContext)
        {
            paramContext = (ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0);
            if (paramContext != null) {
                return (TextUtils.equals(paramContext.topActivity.getPackageName(), paramString1)) && (TextUtils.equals(paramContext.topActivity.getClassName(), paramString2));
            }
            return false;
        }

        public static byte[] a(Bitmap paramBitmap, boolean paramBoolean)
        {
            int i = 100;
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
            while (localByteArrayOutputStream.toByteArray().length / 1024 > 35)
            {
                localByteArrayOutputStream.reset();
                paramBitmap.compress(Bitmap.CompressFormat.JPEG, i, localByteArrayOutputStream);
                i -= 10;
            }
            if (paramBoolean) {
                paramBitmap.recycle();
            }
            paramBitmap = localByteArrayOutputStream.toByteArray();
            try
            {
                localByteArrayOutputStream.close();
                return paramBitmap;
            }
            catch (Exception localException)
            {
                localException.printStackTrace();
            }
            return paramBitmap;
        }

        public static String[] a(Context paramContext, int paramInt)
        {
            return paramContext.getResources().getStringArray(paramInt);
        }

        public static float b(Context paramContext, int paramInt)
        {
            return paramContext.getResources().getDimension(paramInt);
        }

        public static int b(Context paramContext)
        {
            return ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getWidth();
        }

        public static int b(Context paramContext, float paramFloat)
        {
            return (int)(paramFloat / paramContext.getResources().getDisplayMetrics().density + 0.5F);
        }

        public static Bitmap b(Bitmap paramBitmap1, Bitmap paramBitmap2)
        {
            Bitmap localBitmap = Bitmap.createBitmap(Math.max(paramBitmap1.getWidth(), paramBitmap2.getWidth()), paramBitmap1.getHeight() + paramBitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas localCanvas = new Canvas(localBitmap);
            localCanvas.drawBitmap(paramBitmap1, 0.0F, 0.0F, null);
            localCanvas.drawBitmap(paramBitmap2, 0.0F, paramBitmap1.getHeight() + 10, null);
            return localBitmap;
        }

        public static String b()
        {
            Date localDate = new Date();
            return new SimpleDateFormat("yyyy-MM-dd").format(localDate);
        }

        public static String b(long paramLong)
        {
            return new SimpleDateFormat("HH:mm").format(new Date(Long.parseLong(String.valueOf(1000L * paramLong))));
        }

        public static String b(Bitmap paramBitmap)
        {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
            return Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
        }

        public static String b(boolean[] paramArrayOfBoolean)
        {
            StringBuffer localStringBuffer = new StringBuffer();
            int i = 0;
            if (i < paramArrayOfBoolean.length)
            {
                if (paramArrayOfBoolean[i] != 0) {
                    localStringBuffer.append('1');
                }
                for (;;)
                {
                    if ((i + 1) % 16 == 0) {
                        localStringBuffer.append(' ');
                    }
                    i += 1;
                    break;
                    localStringBuffer.append('0');
                }
            }
            localStringBuffer.append(' ');
            return localStringBuffer.toString();
        }

        public static void b(Activity paramActivity)
        {
            paramActivity.getWindow().addFlags(2048);
            paramActivity.getWindow().clearFlags(512);
            paramActivity.getWindow().clearFlags(1024);
        }

        public static void b(Context paramContext, Class paramClass)
        {
            Intent localIntent = new Intent();
            localIntent.setFlags(67108864);
            localIntent.setClass(paramContext, paramClass);
            paramContext.startActivity(localIntent);
        }

        public static void b(Context paramContext, Class paramClass, Bundle paramBundle)
        {
            Intent localIntent = new Intent();
            localIntent.setClass(paramContext, paramClass);
            if (paramBundle != null) {
                localIntent.putExtras(paramBundle);
            }
            paramContext.startActivity(localIntent);
        }

        public static void b(Context paramContext, String paramString)
        {
            Intent localIntent = new Intent();
            localIntent.setAction("android.intent.action.VIEW");
            localIntent.addFlags(268435456);
            paramString = new File(paramString);
            if (Build.VERSION.SDK_INT >= 24)
            {
                paramString = FileProvider.getUriForFile(paramContext, "com.huomaotv.mobile.fileprovider", paramString);
                localIntent.addFlags(1);
                localIntent.setDataAndType(paramString, "application/vnd.android.package-archive");
            }
            for (;;)
            {
                paramContext.startActivity(localIntent);
                return;
                localIntent.setDataAndType(Uri.fromFile(paramString), "application/vnd.android.package-archive");
            }
        }

        public static boolean b(Context paramContext, String paramString1, String paramString2)
        {
            if (TextUtils.isEmpty(paramString1))
            {
                a(paramContext, "����������������");
                return false;
            }
            if ("����+86".indexOf(paramString2) > -1)
            {
                if (!a(paramString1))
                {
                    a(paramContext, "����������������������");
                    return false;
                }
            }
            else if ("����+852".indexOf(paramString2) > -1)
            {
                if (!b(paramString1))
                {
                    a(paramContext, "����������������������");
                    return false;
                }
            }
            else if ("����+853".indexOf(paramString2) > -1)
            {
                if (!c(paramString1))
                {
                    a(paramContext, "����������������������");
                    return false;
                }
            }
            else if (("����+886".indexOf(paramString2) > -1) && (!d(paramString1)))
            {
                a(paramContext, "����������������������");
                return false;
            }
            return true;
        }

        public static boolean b(String paramString)
        {
            return Pattern.compile("^(6|9)[0-9]{7}$").matcher(paramString).matches();
        }

        public static boolean b(List paramList, String paramString)
        {
            int i = 0;
            while (i < paramList.size())
            {
                if (paramString.equals(paramList.get(i))) {
                    return false;
                }
                i += 1;
            }
            return true;
        }

        public static int c(Context paramContext)
        {
            return ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getHeight();
        }

        public static int c(Context paramContext, float paramFloat)
        {
            return (int)(paramContext.getResources().getDisplayMetrics().scaledDensity * paramFloat + 0.5F);
        }

        public static View c(Context paramContext, int paramInt)
        {
            return LayoutInflater.from(paramContext).inflate(paramInt, null);
        }

        public static String c()
        {
            Date localDate = new Date();
            return new SimpleDateFormat("HH:mm").format(localDate);
        }

        public static String c(long paramLong)
        {
            return new SimpleDateFormat("MM-dd HH:mm").format(Long.valueOf(paramLong));
        }

        public static void c(Activity paramActivity)
        {
            paramActivity.getWindow().addFlags(1024);
            paramActivity.getWindow().addFlags(512);
            paramActivity.getWindow().clearFlags(2048);
        }

        public static void c(Context paramContext, Class paramClass, Bundle paramBundle)
        {
            Intent localIntent = new Intent();
            localIntent.setFlags(268435456);
            localIntent.setClass(paramContext, paramClass);
            if (paramBundle != null) {
                localIntent.putExtras(paramBundle);
            }
            paramContext.startActivity(localIntent);
        }

        public static boolean c(Context paramContext, Class paramClass)
        {
            paramClass = new Intent(paramContext, paramClass).resolveActivity(paramContext.getPackageManager());
            if (paramClass != null)
            {
                paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).iterator();
                while (paramContext.hasNext()) {
                    if (((ActivityManager.RunningTaskInfo)paramContext.next()).baseActivity.equals(paramClass)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean c(Context paramContext, String paramString)
        {
            if ((paramContext == null) || (TextUtils.isEmpty(paramString))) {
                return false;
            }
            paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
            return (paramContext != null) && (paramContext.size() > 0) && (paramString.equals(((ActivityManager.RunningTaskInfo)paramContext.get(0)).topActivity.getClassName()));
        }

        public static boolean c(String paramString)
        {
            return Pattern.compile("^6[0-9]{7}$").matcher(paramString).matches();
        }

        public static float d(Context paramContext)
        {
            return b(paramContext) / 16 * 9;
        }

        public static float d(Context paramContext, int paramInt)
        {
            return NBSBitmapFactoryInstrumentation.decodeResource(paramContext.getResources(), paramInt).getWidth();
        }

        public static String d()
        {
            try
            {
                InetAddress localInetAddress;
                do
                {
                    localObject = NetworkInterface.getNetworkInterfaces();
                    Enumeration localEnumeration;
                    while (!localEnumeration.hasMoreElements())
                    {
                        if (!((Enumeration)localObject).hasMoreElements()) {
                            break;
                        }
                        localEnumeration = ((NetworkInterface)((Enumeration)localObject).nextElement()).getInetAddresses();
                    }
                    localInetAddress = (InetAddress)localEnumeration.nextElement();
                } while (localInetAddress.isLoopbackAddress());
                Object localObject = localInetAddress.getHostAddress().toString();
                return (String)localObject;
            }
            catch (SocketException localSocketException) {}
            return null;
        }

        public static String d(long paramLong)
        {
            return new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(Long.valueOf(1000L * paramLong));
        }

        public static void d(Activity paramActivity)
        {
            paramActivity.getWindow().clearFlags(512);
        }

        public static boolean d(Context paramContext, String paramString)
        {
            paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
            int i = 0;
            while (i < paramContext.size())
            {
                if (((ActivityManager.RunningAppProcessInfo)paramContext.get(i)).processName.equals(paramString))
                {
                    Log.i("NotificationLaunch", String.format("the %s is running, isAppAlive return true", new Object[] { paramString }));
                    return true;
                }
                i += 1;
            }
            Log.i("NotificationLaunch", String.format("the %s is not running, isAppAlive return false", new Object[] { paramString }));
            return false;
        }

        public static boolean d(String paramString)
        {
            return Pattern.compile("^9[0-9]{8}$").matcher(paramString).matches();
        }

        public static Bitmap e(Context paramContext, String paramString)
        {
            if ((paramContext != null) && (!"".equals(paramString)) && (paramString.length() >= 2))
            {
                paramContext = paramContext.getResources();
                ArrayList localArrayList = new ArrayList();
                int i = 0;
                int j = 0;
                int k = 0;
                while (i < paramString.length())
                {
                    Bitmap localBitmap = NBSBitmapFactoryInstrumentation.decodeResource(paramContext, ((Integer)l.f().e().get(paramString.charAt(i) + "")).intValue());
                    localArrayList.add(localBitmap);
                    k += localBitmap.getWidth();
                    j = Math.max(localBitmap.getHeight(), j);
                    i += 1;
                }
                if (localArrayList.size() >= 2) {
                    return a(localArrayList, k, j);
                }
                return null;
            }
            return null;
        }

        public static String e(long paramLong)
        {
            if ((paramLong <= 0L) || (paramLong >= 86400000L)) {
                return "00:00";
            }
            long l2 = paramLong / 1000L;
            paramLong = l2 % 60L;
            long l1 = l2 / 60L % 60L;
            l2 /= 3600L;
            Formatter localFormatter = new Formatter(new StringBuilder(), Locale.getDefault());
            if (l2 > 0L) {
                return localFormatter.format("%d:%02d:%02d", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(paramLong) }).toString();
            }
            return localFormatter.format("%02d:%02d", new Object[] { Long.valueOf(l1), Long.valueOf(paramLong) }).toString();
        }

        public static String e(String paramString)
        {
            if ("����".equals(paramString)) {
                return "86";
            }
            if ("����".equals(paramString)) {
                return "852";
            }
            if ("����".equals(paramString)) {
                return "853";
            }
            if ("����".equals(paramString)) {
                return "886";
            }
            return "";
        }

        public static void e(Activity paramActivity)
        {
            b(paramActivity);
            paramActivity.getWindow().addFlags(65536);
        }

        public static boolean e(Context paramContext)
        {
            paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
            if (paramContext == null) {}
            for (;;)
            {
                return false;
                paramContext = paramContext.getAllNetworkInfo();
                if (paramContext != null)
                {
                    int i = 0;
                    while (i < paramContext.length)
                    {
                        if (paramContext[i].getState() == NetworkInfo.State.CONNECTED) {
                            return true;
                        }
                        i += 1;
                    }
                }
            }
        }

        public static String[] e()
        {
            return new String[] { "application/octet-stream" };
        }

        public static int f(Activity paramActivity)
        {
            Rect localRect = new Rect();
            paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
            return localRect.top;
        }

        public static String f()
        {
            return Build.VERSION.RELEASE;
        }

        public static boolean f(Context paramContext)
        {
            Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
            paramContext = ((ConnectivityManager)localObject).getNetworkInfo(1);
            localObject = ((ConnectivityManager)localObject).getNetworkInfo(0);
            return (paramContext.isAvailable()) || (((NetworkInfo)localObject).isAvailable());
        }

        public static boolean f(String paramString)
        {
            try
            {
                boolean bool = Pattern.compile("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$").matcher(paramString).matches();
                return bool;
            }
            catch (Exception paramString) {}
            return false;
        }

        public static int g()
        {
            return Integer.valueOf(Build.VERSION.SDK).intValue();
        }

        public static String g(Context paramContext)
        {
            int i = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
            if (i == 0) {
                return null;
            }
            return (i & 0xFF) + "." + (i >> 8 & 0xFF) + "." + (i >> 16 & 0xFF) + "." + (i >> 24 & 0xFF);
        }

        public static boolean g(String paramString)
        {
            return Pattern.compile("[a-zA-Z0-9_]{8,16}$").matcher(paramString).matches();
        }

        public static String h()
        {
            return Build.MANUFACTURER;
        }

        public static String h(Context paramContext)
        {
            return ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }

        public static boolean h(String paramString)
        {
            return Pattern.compile("[0-9]$").matcher(paramString).matches();
        }

        public static InputFilter i()
        {
            new InputFilter()
            {
                Pattern a = Pattern.compile("[?-?]|[?-?]|[?-?]", 66);

                public CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
                {
                    if (this.a.matcher(paramAnonymousCharSequence).find()) {
                        return "";
                    }
                    return null;
                }
            };
        }

        public static String i(Context paramContext)
        {
            try
            {
                paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
                return paramContext;
            }
            catch (PackageManager.NameNotFoundException paramContext)
            {
                paramContext.printStackTrace();
            }
            return null;
        }

        public static boolean i(String paramString)
        {
            return Pattern.compile("/^[1-9]+\\d*$").matcher(paramString).matches();
        }

        public static int j(Context paramContext)
        {
            try
            {
                int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
                return i;
            }
            catch (PackageManager.NameNotFoundException paramContext)
            {
                paramContext.printStackTrace();
            }
            return 0;
        }

        public static String j()
        {
            int i = 0;
            Object localObject = "010011";
            while (i < 26)
            {
                localObject = new StringBuilder().append((String)localObject);
                int j = (int)(Math.random() * 16.0D);
                localObject = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" }[j];
                i += 1;
            }
            return (String)localObject;
        }

        public static String j(String paramString)
        {
            if (paramString == null) {
                return null;
            }
            try
            {
                MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
                localMessageDigest.update(paramString.getBytes());
                paramString = a(localMessageDigest.digest());
                return paramString;
            }
            catch (Exception paramString)
            {
                throw new RuntimeException(paramString);
            }
        }

        public static int k(Context paramContext)
        {
            int i = 0;
            int j = paramContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (j > 0) {
                i = paramContext.getResources().getDimensionPixelSize(j);
            }
            return i;
        }

        private static String k()
        {
            String str = Environment.getExternalStorageDirectory().getPath() + "/huomaotv";
            File localFile = new File(str);
            if (!localFile.exists()) {
                localFile.mkdirs();
            }
            return str;
        }

        public static String k(String paramString)
        {
            ArrayList localArrayList1 = new ArrayList();
            ArrayList localArrayList2 = new ArrayList();
            Matcher localMatcher = Pattern.compile("[\"'](http.+\\.(jpg|gif|png))[\"']").matcher(paramString);
            String str = paramString;
            if (localMatcher.find())
            {
                str = localMatcher.group(1).substring(localMatcher.group(1).lastIndexOf("/") + 1, localMatcher.group(1).lastIndexOf("."));
                localArrayList1.add("<img src=\"http://static.huomaotv.com/static/face/x-x-x.gif\"/>".replace("x-x-x", str));
                localArrayList2.add(str);
                str = paramString.replace("<img src=\"http://static.huomaotv.com/static/face/x-x-x.gif\"/>".replace("x-x-x", str), "[f:" + localMatcher.group(1).substring(localMatcher.group(1).lastIndexOf("/") + 1, localMatcher.group(1).lastIndexOf(".")) + "]");
            }
            return str;
        }

        public static int l(Context paramContext)
        {
            try
            {
                Class localClass = Class.forName("com.android.internal.R$dimen");
                Object localObject = localClass.newInstance();
                int i = Integer.parseInt(localClass.getField("status_bar_height").get(localObject).toString());
                i = paramContext.getResources().getDimensionPixelSize(i);
                return i;
            }
            catch (Exception paramContext)
            {
                paramContext.printStackTrace();
            }
            return -1;
        }

        public static String l(String paramString)
        {
            Matcher localMatcher = Pattern.compile("[\"'](http.+\\.(jpg|gif|png))[\"']").matcher(paramString);
            String str = paramString;
            if (localMatcher.find()) {
                str = paramString.replace("<img src=\"http://static.huomaotv.com/static/face/x-x-x.gif\"/>".replace("x-x-x", localMatcher.group(1).substring(localMatcher.group(1).lastIndexOf("/") + 1, localMatcher.group(1).lastIndexOf("."))), "");
            }
            return str;
        }

        public static String m(String paramString)
        {
            return paramString.replaceAll("\\[f:\\d{1,3}\\]", "");
        }

        public static boolean m(Context paramContext)
        {
            List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
            return (!localList.isEmpty()) && (!((ActivityManager.RunningTaskInfo)localList.get(0)).topActivity.getPackageName().equals(paramContext.getPackageName()));
        }

        public static int n(Context paramContext)
        {
            if (y.a(paramContext, "server_current_and_system_time") > 0) {
                return y.a(paramContext, "servers_start_api_time") + y.a(paramContext, "server_current_and_system_time") - y.a(paramContext, "servers_current_system_time") + Integer.parseInt(f.a().b());
            }
            return y.a(paramContext, "servers_start_api_time") - y.a(paramContext, "servers_current_system_time") + Integer.parseInt(f.a().b());
        }

        public static String n(String paramString)
        {
            Object localObject2 = null;
            Object localObject1 = null;
            try
            {
                MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
                localObject1 = localMessageDigest;
                localObject2 = localMessageDigest;
                localMessageDigest.reset();
                localObject1 = localMessageDigest;
                localObject2 = localMessageDigest;
                localMessageDigest.update(paramString.getBytes("UTF-8"));
                localObject1 = localMessageDigest;
            }
            catch (NoSuchAlgorithmException paramString)
            {
                for (;;)
                {
                    System.out.println("NoSuchAlgorithmException caught!");
                }
            }
            catch (UnsupportedEncodingException paramString)
            {
                for (;;)
                {
                    int i;
                    paramString.printStackTrace();
                    localObject1 = localObject2;
                    continue;
                    ((StringBuffer)localObject1).append(Integer.toHexString(paramString[i] & 0xFF));
                }
            }
            paramString = ((MessageDigest)localObject1).digest();
            localObject1 = new StringBuffer();
            i = 0;
            for (;;)
            {
                if (i >= paramString.length) {
                    break label150;
                }
                if (Integer.toHexString(paramString[i] & 0xFF).length() != 1) {
                    break;
                }
                ((StringBuffer)localObject1).append("0").append(Integer.toHexString(paramString[i] & 0xFF));
                i += 1;
            }
            label150:
            return ((StringBuffer)localObject1).toString();
        }

        public static boolean o(Context paramContext)
        {
            boolean bool2 = false;
            paramContext = paramContext.getPackageManager().getInstalledPackages(0);
            boolean bool1 = bool2;
            int i;
            if (paramContext != null) {
                i = 0;
            }
            for (;;)
            {
                bool1 = bool2;
                if (i < paramContext.size())
                {
                    if (((PackageInfo)paramContext.get(i)).packageName.equals("com.tencent.mm")) {
                        bool1 = true;
                    }
                }
                else {
                    return bool1;
                }
                i += 1;
            }
        }

        public static void p(String paramString)
        {
            paramString = paramString + "\n";
            try
            {
                File localFile = new File(k() + "/result.txt");
                if (!localFile.exists()) {
                    localFile.createNewFile();
                }
                RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile, "rw");
                localRandomAccessFile.seek(localFile.length());
                localRandomAccessFile.write(paramString.getBytes());
                localRandomAccessFile.close();
                return;
            }
            catch (Exception paramString)
            {
                paramString.printStackTrace();
            }
        }

        public static boolean p(Context paramContext)
        {
            boolean bool2 = false;
            paramContext = paramContext.getPackageManager().getInstalledPackages(0);
            boolean bool1 = bool2;
            int i;
            if (paramContext != null) {
                i = 0;
            }
            for (;;)
            {
                bool1 = bool2;
                if (i < paramContext.size())
                {
                    if (((PackageInfo)paramContext.get(i)).packageName.equals("com.sina.weibo")) {
                        bool1 = true;
                    }
                }
                else {
                    return bool1;
                }
                i += 1;
            }
        }

        public static boolean q(Context paramContext)
        {
            boolean bool2 = false;
            paramContext = paramContext.getPackageManager().getInstalledPackages(0);
            boolean bool1 = bool2;
            int i;
            if (paramContext != null) {
                i = 0;
            }
            for (;;)
            {
                bool1 = bool2;
                if (i < paramContext.size())
                {
                    String str = ((PackageInfo)paramContext.get(i)).packageName;
                    if ((str.equalsIgnoreCase("com.tencent.qqlite")) || (str.equalsIgnoreCase("com.tencent.mobileqq"))) {
                        bool1 = true;
                    }
                }
                else
                {
                    return bool1;
                }
                i += 1;
            }
        }

        public static boolean[] q(String paramString)
        {
            return v(t(r(paramString)));
        }

        public static String r(String paramString)
        {
            char[] arrayOfChar = paramString.toCharArray();
            paramString = "";
            int i = 0;
            while (i < arrayOfChar.length)
            {
                paramString = paramString + Integer.toBinaryString(arrayOfChar[i]) + " ";
                i += 1;
            }
            return paramString;
        }

        public static String s(String paramString)
        {
            paramString = x(paramString);
            char[] arrayOfChar = new char[paramString.length];
            int i = 0;
            while (i < paramString.length)
            {
                arrayOfChar[i] = w(paramString[i]);
                i += 1;
            }
            return String.valueOf(arrayOfChar);
        }

        public static String t(String paramString)
        {
            StringBuffer localStringBuffer = new StringBuffer();
            paramString = x(paramString);
            int i = 0;
            while (i < paramString.length)
            {
                int j = 16 - paramString[i].length();
                while (j > 0)
                {
                    localStringBuffer.append('0');
                    j -= 1;
                }
                localStringBuffer.append(paramString[i] + " ");
                i += 1;
            }
            return localStringBuffer.toString();
        }

        public static String u(String paramString)
        {
            StringBuffer localStringBuffer = new StringBuffer();
            paramString = x(paramString);
            int i = 0;
            if (i < paramString.length)
            {
                int j = 0;
                for (;;)
                {
                    if (j < 16)
                    {
                        if (paramString[i].charAt(j) == '1') {
                            localStringBuffer.append(paramString[i].substring(j) + " ");
                        }
                    }
                    else
                    {
                        i += 1;
                        break;
                    }
                    if ((j == 15) && (paramString[i].charAt(j) == '0')) {
                        localStringBuffer.append("0 ");
                    }
                    j += 1;
                }
            }
            return localStringBuffer.toString();
        }

        public static boolean[] v(String paramString)
        {
            boolean[] arrayOfBoolean = new boolean[x(paramString).length * 16];
            int i = 0;
            int j = 0;
            if (j < paramString.length())
            {
                if (paramString.charAt(j) == '1') {
                    arrayOfBoolean[i] = true;
                }
                for (;;)
                {
                    j += 1;
                    i += 1;
                    break;
                    if (paramString.charAt(j) == '0') {
                        arrayOfBoolean[i] = false;
                    } else {
                        i -= 1;
                    }
                }
            }
            return arrayOfBoolean;
        }

        public static char w(String paramString)
        {
            int i = 0;
            paramString = y(paramString);
            int j = 0;
            while (i < paramString.length)
            {
                j += (paramString[(paramString.length - 1 - i)] << i);
                i += 1;
            }
            return (char)j;
        }

        public static String[] x(String paramString)
        {
            return paramString.split(" ");
        }

        public static int[] y(String paramString)
        {
            paramString = paramString.toCharArray();
            int[] arrayOfInt = new int[paramString.length];
            int i = 0;
            while (i < paramString.length)
            {
                paramString[i] -= '0';
                i += 1;
            }
            return arrayOfInt;
        }

        public static String z(String paramString)
        {
            if ((paramString == null) || (paramString.equals(""))) {
                return "";
            }
            paramString = paramString.split("/");
            return paramString[(paramString.length - 1)];
        }

        @SuppressLint({"SdCardPath"})
        public void a(String paramString, Bitmap paramBitmap)
        {
            paramString = new File("/sdcard/" + paramString + ".png");
            try
            {
                paramString.createNewFile();
                try
                {
                    paramString = new FileOutputStream(paramString);
                    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramString);
                }
                catch (FileNotFoundException paramString)
                {
                    try
                    {
                        paramString.flush();
                        try
                        {
                            paramString.close();
                            return;
                        }
                        catch (IOException paramString)
                        {
                            paramString.printStackTrace();
                            return;
                        }
                        paramString = paramString;
                        paramString.printStackTrace();
                        paramString = null;
                    }
                    catch (IOException paramBitmap)
                    {
                        for (;;)
                        {
                            paramBitmap.printStackTrace();
                        }
                    }
                }
            }
            catch (IOException localIOException)
            {
                for (;;) {}
            }
        }

        public Bitmap o(String paramString)
        {
            try
            {
                paramString = Base64.decode(paramString, 0);
                paramString = NBSBitmapFactoryInstrumentation.decodeByteArray(paramString, 0, paramString.length);
                return paramString;
            }
            catch (Exception paramString)
            {
                paramString.printStackTrace();
            }
            return null;
        }
    }*/


